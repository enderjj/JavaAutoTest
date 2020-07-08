package com.enderjj.test.httpClient;

import com.mongodb.util.JSON;
import netscape.javascript.JSObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class LoginTest {

    private static String url;
    private static String username;
    private static String password;

    @BeforeClass
    public void beforeClass() {
        ResourceBundle bundle = ResourceBundle.getBundle("application");
        url = bundle.getString("BASEURL");
        username = bundle.getString("USERNAME");
        password = bundle.getString("PASSWORD");
    }

    @Test
    public void loginTest() throws IOException {
        System.out.println("url ======== " + url);
        String uri = url + "/pc/auth/login";
        System.out.println("uri ======== " + uri);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(uri);

        Map<String, String> params = new HashMap<String, String>();
        params.put("mobile", username);
        params.put("password", password);

        JSONObject body = new JSONObject(params);
        StringEntity se = new StringEntity(body.toString(), "utf-8");

//        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
//        nvps.add(new BasicNameValuePair("mobile", username));
//        nvps.add(new BasicNameValuePair("password", password));
        post.setEntity(se);
        post.setHeader("Content-Type", "application/json");
        CloseableHttpResponse response = httpClient.execute(post);

        try {
            System.out.println("response status ======= " + response.getStatusLine());
            HttpEntity entity = response.getEntity();
            System.out.println("response data ======= " + EntityUtils.toString(entity, "utf-8"));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            response.close();
        }

    }
}

package com.enderjj.test.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo {

    @Test
    public void firstTest() throws IOException {
        String result;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://zhike.youdao.com/");
        CloseableHttpResponse response = httpClient.execute(get); // 执行请求

        System.out.println("response status ====== " + response.getStatusLine()); // 获取响应结果状态行
        HttpEntity entity = response.getEntity(); // 获取响应结果
//        System.out.println("response ====== " + entity);
        result = EntityUtils.toString(entity, "utf-8"); // 将响应结果转换成字符串打印
        System.out.println("response ====== " + result);
    }
}

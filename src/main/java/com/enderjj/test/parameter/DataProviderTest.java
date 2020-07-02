package com.enderjj.test.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 通过 DataProvider 实现参数化测试
 */
public class DataProviderTest {

    @Test(dataProvider = "data") // dataProvider 属性指定使用哪个 dataProvider
    public void testDataProvider(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @DataProvider(name = "data") // @DataProvider 注解标注该方法是一个 DataProvider
    public Object[][] provider() {
        Object[][] objects = new Object[][] {
                {"test1", 10},
                {"test2", 15},
                {"test3", 20},
        };

        return objects;
    }

    /**
     * 多个测试用例的方法参数相同时，`@DataProvider` 可以针对不同的测试用例提供不同的数据
     */
    @Test(dataProvider = "method")
    public void test1(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Test(dataProvider = "method")
    public void test2(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @DataProvider(name = "method")
    public Object[][] methodProvider(Method method) {
        Object[][] objects = null;

        // 针对不同的测试用例传入不同的参数
        if (method.getName().equals("test1")) {
            objects = new Object[][] {
                    {"test1", 10},
                    {"test2", 20}
            };
        } else if (method.getName().equals("test2")) {
            objects = new Object[][] {
                    {"test3", 30},
                    {"test4", 40}
            };
        }

        return objects;
    }
}

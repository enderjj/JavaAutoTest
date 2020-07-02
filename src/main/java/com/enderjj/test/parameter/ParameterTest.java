package com.enderjj.test.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 通过 @Parameter 注解实现参数化测试
 */
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void test1(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

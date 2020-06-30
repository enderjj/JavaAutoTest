package com.enderjj.test;

import org.testng.annotations.*;

/**
 * TestNG 基本注解
 */
public class BasicAnnotation {

    @BeforeClass // 在 class 运行之前运行
    public void runBeforeClass() {
        System.out.println("=== 这是 BeforeClass ===");
    }

    @AfterClass // 在 class 运行之后运行
    public void runAfterClass() {
        System.out.println("=== 这是 AfterClass ===");
    }

    @BeforeMethod // 在 class 的每个测试用例运行之前运行
    public void runBeforeMethod() {
        System.out.println("=== 这是 BeforeMethod ===");
    }

    @AfterMethod // 在 class 的每个测试用例运行之后运行
    public void runAfterMethod() {
        System.out.println("=== 这是 AfterMethod ===");
    }

    @Test // 标注一个方法为测试用例
    public void firstTest() {
        System.out.println("=== 这是第一个测试用例 ===");
    }

    @Test
    public void secondTest() {
        System.out.println("=== 这是第二个测试用例 ===");
    }
}

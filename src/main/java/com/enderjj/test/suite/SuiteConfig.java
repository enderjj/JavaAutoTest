package com.enderjj.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 测试套件 Suite 配置
 */
public class SuiteConfig {

    @BeforeSuite // 在测试套件 suite 运行之前运行
    public void beforeSuite() {
        System.out.println("=== 这是 BeforeSuite ===");
    }

    @AfterSuite // 在测试套件 suite 运行之后运行
    public void afterSuite() {
        System.out.println("=== 这是 AfterSuite ===");
    }

    @BeforeTest  // 在测试套件 suite 下的每个 test 运行之前运行
    public void beforeTest() {
        System.out.println("=== 这是 BeforeTest ===");
    }

    @AfterTest // 在测试套件 suite 下的每个 test 运行之后运行
    public void afterTest() {
        System.out.println("=== 这是 AfterTest ===");
    }

}

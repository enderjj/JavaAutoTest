package com.enderjj.test;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {

    @Test
    public void unIgnoreTest() {
        System.out.println("=== unIgnoreTest is run ===");
    }

    @Test(enabled = false) // enabled = false 表示该用例不运行
    public void ignoreTest() {
        System.out.println("=== ignoreTest not run ===");
    }
}

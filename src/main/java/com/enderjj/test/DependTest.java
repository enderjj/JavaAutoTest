package com.enderjj.test;

import org.testng.annotations.Test;

/**
 * 依赖测试
 * dependsOnMethods 用来标注方法依赖
 * dependsOnGroups 用来标注组依赖：只有依赖组内的所有用例都执行成功，才会执行，否则忽略不执行
 */
public class DependTest {

    @Test
    public void test1() {
        System.out.println("=== 这是 DependTest 的 test1 ===");
    }

    @Test(dependsOnMethods = {"test1"}) // test1 执行成功，test2 就会被执行
    public void test2() {
        System.out.println("=== 这是成功的依赖测试 test2 ===");
    }

    @Test
    public void test3() {
        System.out.println("=== 这是 DependTest 的 test3 ===");
        throw new RuntimeException(); // 抛出异常，用来模拟用例执行失败
    }

    @Test(dependsOnMethods = {"test3"}) // test3 执行失败，test4 就会被忽略
    public void test4() {
        System.out.println("=== 这是失败的依赖测试 test4 ===");
    }
}

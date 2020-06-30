package com.enderjj.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "server") // groups 属性指定测试用例所属分组
    public void test1() {
        System.out.println("=== 这是 server 组的测试用例 test1 ===");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("=== 这是 server 组的测试用例 test2 ===");
    }

    @Test(groups = "client") // groups 属性指定测试用例所属分组
    public void test3() {
        System.out.println("=== 这是 client 组的测试用例 test3 ===");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("=== 这是 client 组的测试用例 test4 ===");
    }

    @BeforeGroups("server") // 表示在 server 组运行之前运行
    public void beforeGroup() {
        System.out.println("=== 这是 server 组的 BeforeGroups ===");
    }

    @AfterGroups("server") // 表示在 server 组运行之后运行
    public void afterGroup() {
        System.out.println("=== 这是 server 组的 AfterGroups ===");
    }
}

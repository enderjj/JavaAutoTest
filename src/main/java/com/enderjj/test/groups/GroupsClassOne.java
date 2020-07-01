package com.enderjj.test.groups;

import org.testng.annotations.Test;

@Test(groups = "groupOne")
public class GroupsClassOne {

    public void test1() {
        System.out.println("=== 这是 GroupsClassOne 的 test1 用例 ===");
    }

    public void test2() {
        System.out.println("=== 这是 GroupsClassOne 的 test2 用例 ===");
    }
}

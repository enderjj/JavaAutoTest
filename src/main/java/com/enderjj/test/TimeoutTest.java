package com.enderjj.test;

import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(timeOut = 3000) // 用 timeOut 属性指定测试用例运行的超时时间
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("===== TimeoutTest success =====");
    }

    @Test(timeOut = 2000)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("===== TimeoutTest fail =====");
    }
}

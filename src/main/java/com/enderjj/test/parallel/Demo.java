package com.enderjj.test.parallel;

import org.testng.annotations.Test;

public class Demo {
    @Test
    public void demoTest1() {
        System.out.println("demoTest1 Thread Id: " + Thread.currentThread().getId());
    }

    @Test
    public void demoTest2() {
        System.out.println("demoTest2 Thread Id: " + Thread.currentThread().getId());
    }
}

package com.enderjj.test.parallel;

import org.testng.annotations.Test;

public class ParallelTest {

    @Test
    public void test1() {
        System.out.println("test1 Thread Id: " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("test2 Thread Id: " + Thread.currentThread().getId());
    }
}

package com.enderjj.test.extentDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentReportDemo {

    @Test
    public void reportTest1() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void reportTest2() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void logDemo() {
        Reporter.log("这是我们自己记录的日志");
        throw new RuntimeException("这是我们自己抛出的异常");
    }
}

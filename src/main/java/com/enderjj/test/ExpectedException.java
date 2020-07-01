package com.enderjj.test;

import org.testng.annotations.Test;

/**
 * 异常测试
 */
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFail() {
        System.out.println("=== 这是一个失败的异常测试用例 ===");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("=== 这是一个成功的异常测试用例 ===");
        throw new RuntimeException();
    }
}

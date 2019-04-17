package com.test.testng.suite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by zhoujingrong on 2019/3/29.
 */
public class Pay {
    @Test
    public void test1(){
        System.out.println("测试支付案例1");
    }
    @Test
    public void test2(){
        System.out.println("测试支付案例2");
    }
    @BeforeTest
    public void test3(){
        System.out.println("测试支付案例3");
    }
}

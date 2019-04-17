package com.test.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by zhoujingrong on 2019/3/29.
 */
public class Login {
    @Test
    public void test1(){
        System.out.println("测试案例aa1");
    }
    @Test
    public void test2(){
        System.out.println("测试案例aa2");
    }
    @BeforeTest(enabled = false)
    public void test3(){
        System.out.println("wwww");
    }
    @AfterTest(enabled = false)
    public void test4(){
        System.out.println("aadddd");
    }
}

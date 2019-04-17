package com.test.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by zhoujingrong on 2019/3/29.
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("运行beforeSuite套件");
    }
    @AfterSuite
    public void atftersuite(){
        System.out.println("运行aftersuite套件");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("测试方法执行之前！");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("测试方法执行之后！");
    }
}

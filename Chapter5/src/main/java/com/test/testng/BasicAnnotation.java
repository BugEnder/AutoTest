package com.test.testng;

import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;
import org.testng.annotations.*;

import java.net.SocketOption;

/**
 * Created by zhoujingrong on 2019/3/29.
 */
 public class BasicAnnotation {

    @Test
    public void testcase1(){
        System.out.println("这是测试案例一！");
    }
    @Test
    public void testcasse2(){
        System.out.println("测试案例二！");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("这是在测试方法之前运行的！！");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("测试方法之后云之后运行的！！");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass类运行之前运行的方法!");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclass类运行之后运行的方法！");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("运行beforesuite!");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("运行aftersuite!");
    }
}

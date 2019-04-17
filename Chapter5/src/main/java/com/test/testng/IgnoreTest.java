package com.test.testng;

import org.testng.annotations.Test;

/**
 * Created by zhoujingrong on 2019/4/1.
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    @Test(enabled =true)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = false)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}

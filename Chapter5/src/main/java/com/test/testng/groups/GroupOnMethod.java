package com.test.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups="servers")
    public void method1(){
        System.out.println("服务端分组测试方法一");
    }
    @Test(groups="servers")
    public void method2(){
        System.out.println("服务端分组测试方法二");
    }
    @Test(groups="client")
    public void method3(){
        System.out.println("客户端分组测试方法一");
    }
    @Test(groups="client")
    public void method4(){
        System.out.println("客户端分组测试方法二");
    }
    @BeforeGroups("client")
    public void method5(){
        System.out.println("客户端分组测试之前执行的方法");
    }
    @AfterGroups("client")
    public void method6(){
        System.out.println("客户端分组测试执行之后的方法");
    }
    @BeforeGroups("servers")
    public void method7(){
        System.out.println("服务端分组测试之前执行的方法");
    }
    @AfterGroups("servers")
    public void method8(){
        System.out.println("服务端分组测试执行之后的方法");
    }
}

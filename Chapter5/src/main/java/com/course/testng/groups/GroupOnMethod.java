package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端的测试方法1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端的测试方法2");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端的测试方法3");
    }

    @BeforeGroups("server")
    public void beforeGropesServer() {
        System.out.println("这是服务端运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("这是服务端组运行之后运行的方法");
    }
}

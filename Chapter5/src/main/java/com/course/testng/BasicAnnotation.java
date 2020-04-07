package com.course.testng;
import org.testng.annotations.*;

public class BasicAnnotation {

    //用来吧方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是一个测试用例");
    }

    @Test
    public void testCase2(){
        System.out.println("test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeTest这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之前运行的方法");
    }
}

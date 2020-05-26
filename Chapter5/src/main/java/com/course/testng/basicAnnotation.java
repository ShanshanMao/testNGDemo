package com.course.testng;

import org.testng.annotations.*;

public class basicAnnotation {


    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("This is test1 case 1.");
    }

    @Test
    public void testCase2(){
        System.out.println("This is test2 case 2.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is run before the test1 method！");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is run after the test1 method!");
    }

    //这是在类运行之前运行的方法
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass is the method that runs before the class runs");
    }

    //这是在类运行之后运行的方法
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass is the method that runs after the class runs");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件!");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件!");
    }
}


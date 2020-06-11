package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite is running!");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite is running!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest!");
    }

}

package com.course.testng;

import org.testng.annotations.Test;

public class dependTest {
    //例：让test2依赖test1
    @Test
    public void test1(){
        System.out.println("test1 run !");
        //如果test1抛出异常，执行失败，那么test2将被忽略
       //throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run!");
    }
}

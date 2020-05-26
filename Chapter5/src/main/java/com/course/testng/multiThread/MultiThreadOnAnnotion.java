package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    //threadPoolSize 线程池，线程池中有3个线程，就可以分组去拿
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        //打印线程ID
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}

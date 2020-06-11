package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    //这是一个简单的例子，说明怎么把一个简单的参数传到方法里面。
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name="data") //这里的"name"取值和上面Test里面的值一样，取"data"
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"lixian",28},
                {"lisa",20},
                {"elva",40}
        };
        return o;
    }

    //这个例子是说明，怎么通过方法名去传递参数
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1 方法 name="+name+"; age="+age);

    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2 方法 name="+name+"; age="+age);

    }
    @DataProvider(name="methodData")

    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"james",32},
                    {"Gongne",28}

            };

        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"kongliu",40},
                    {"Any",27}
            };
        }

        return result;
    }
}

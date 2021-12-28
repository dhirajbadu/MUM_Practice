package com.practice;

public class Test {
    public static void test(String testName , int actual, int expected) throws Exception{
        if(actual == expected){
            System.out.println(testName + " Test has been passed");
        }else{
            throw new Exception(testName + " Test has been fail\n actual : " + actual + " ; expected : " + expected);
        }
    }
}

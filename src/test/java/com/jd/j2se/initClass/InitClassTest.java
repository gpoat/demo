package com.jd.j2se.initClass;

import java.net.URLDecoder;
import java.util.HashMap;

/**
 * Created by lichunran on 2017/11/2.
 */
public class InitClassTest {
    public static void main(String[] args) {
        /*Test test = new Test();
        try {
            Class.forName("com.jd.j2se.initClass.Test");
            Class<Test> clazz = Test.class;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Test.i);
        System.out.println(Test.initTestStr);
        String decode = URLDecoder.decode("%3A%2F%2F");
        System.out.println(decode);*/
        System.out.println(StaticArg.i);
    }
}

class Test {
    //按顺序初始化
    public static int i = 4;

    static {
        i = 5;
    }

    int j = 3;
    //引用类型默认置空
    static String initTestStr;

    public int sum(int i, int j) {
        return i + j;
    }
}

class StaticArg {
    public static int i = 3;
}

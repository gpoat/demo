package com.jd.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichunran on 2018/2/2.
 * 方法参数传递为复制传递，基本类型复制值，引用类型复制变量
 */
public class MethodArg {

    public static void main(String[] args) {

        /*int a = 5;
        int b = 8;
        swap(a, b);
        System.out.println("a:" + a + ",b:" + b);*/
        int capacity = 1;
        capacity <<= 2;
        System.out.println(capacity);
        List<Integer> i = new ArrayList<Integer>();
//        i.add("123");

    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + ",b:" + b);
    }

    private static void internTest() {
        String str = new String("abc");
        System.out.println(str.intern());
    }
}

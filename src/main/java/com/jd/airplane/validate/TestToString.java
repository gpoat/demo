package com.jd.airplane.validate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichunran on 2018/5/29.
 */
public abstract class TestToString {

    public TestToString() {
        super();
        System.out.println("123");
    }


    private static void test1() {

    }

    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("234");
        String message = list.toString();
        System.out.println("乘机人【" + message.substring(1, message.length() - 1) + "】非法");
        String s = "123";
        System.out.println(s.indexOf("1"));
        System.out.println(s.indexOf("0"));
        System.out.println("in main");*/
//      test();
        Math.ceil(512.51);
        System.out.println(Math.ceil(512.41));
        System.out.println(Math.floor(512.51));
        System.out.println(Math.round(-512.51));
        System.out.println(null instanceof Object);
        Boolean b = true;

    }


    private static void test() {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(JSON.toJSONString(list));
        String[] strings = {"1", "2", "3"};
        System.out.println(JSON.toJSONString(strings));
        return;
    }
}

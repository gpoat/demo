package com.jd.airplane.validate;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Created by lichunran on 2018/3/23.
 */
public class Test {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("66762", "2017-11-16 10:30:00");
        map.put("66721", "2017-11-16 10:30:00");
        map.put("615927", "2017-11-16 10:30:00");
        map.put("616066", "2017-11-16 10:30:00");
        map.put("124207", "2017-11-16 10:30:00");
        map.put("667973", "2017-11-16 10:30:00");
        map.put("59042", "2017-11-16 10:30:00");
        map.put("67741", "2017-11-16 10:30:00");
        map.put("59043", "2017-11-16 10:30:00");
        map.put("67623", "2017-11-16 10:30:00");
        map.put("137028", "2017-11-16 10:30:00");
        map.put("66363", "2017-11-16 10:30:00");
        map.put("66301", "2017-11-16 10:30:00");
        map.put("86385", "2017-11-16 10:30:00");
        map.put("67241", "2017-11-16 10:30:00");
        map.put("66361", "2017-11-16 10:30:00");
        map.put("67601", "2017-11-16 10:30:00");
        map.put("67562", "2017-11-16 10:30:00");
        map.put("66262", "2017-11-16 10:30:00");
        String s = JSON.toJSONString(map);
        System.out.println(s);

    }

    @org.junit.Test
    public void test() {
        Set<String> set1 = new HashSet();
        Set<String> set2 = new HashSet();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        //交集
        set1.removeAll(set2);

        System.out.println("交集是 "+set1);
    }

    @org.junit.Test
    public void ClassLoadTest() {
        a("123");
    }

    private void a(Object o){
        System.out.println(o);
    }
}

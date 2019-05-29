package com.jd.airplane.validate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by lichunran on 2018/5/9.
 */
public class TestMap {

    public static void main(String[] args) {

        Map map = new HashMap(3);
        System.out.println(map.put("2", "123"));
        System.out.println(map.put("1", "234"));
        System.out.println(map.put("3", "789"));
        System.out.println(map.put(null, "1234"));
        Iterator iterator = map.values().iterator();
        while(iterator.hasNext()) {
            iterator.next();
        }

//        Executors.newFixedThreadPool(10);
//        System.out.println(map.values().toString());
    }
}

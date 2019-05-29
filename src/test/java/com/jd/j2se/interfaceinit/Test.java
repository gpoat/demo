package com.jd.j2se.interfaceinit;


import com.jd.j2se.interfaceinit.animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichunran on 2018/1/15.
 */
public class Test {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,"123");
        map.get("123");
        System.out.println(map.get(null));
        System.out.println(null == "123");
    }
}

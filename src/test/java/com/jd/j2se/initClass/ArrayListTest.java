package com.jd.j2se.initClass;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by lichunran on 2017/11/2.
 */
public class ArrayListTest {

    @Test
    public void arrayListTest() {
        ArrayList<String> stringList = null;
        stringList.add("123");

        System.out.println(stringList.get(0));
    }
}

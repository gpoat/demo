package com.jd.arithmetic.collection.second;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lichunran on 2018/3/6.
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        SequenceList<String> list = new SequenceList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println(list);
        isSecondClear(new Date());
    }

    private static boolean isSecondClear(Date date) {
        boolean flag = false;
        try {
            if(date == null)
                throw new IllegalArgumentException("参数date不可为空");
            String startTime = null;
            if(startTime == null)
                throw new RuntimeException("从pop获取SECONDCLEAR_VENDER_LIST返回空");
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
            return flag;
        }
    }
    private static void test(ArrayList list) {

    }
}

package com.jd.arithmetic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lichunran on 2018/2/5.
 */
public class Test {

    public static void main(String[] args) {

        /*long start = System.currentTimeMillis();
        int a = 1;
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        SequenceList<String> s = new SequenceList<String>();
        s.add("111");
        s.add("333");
        s.add("444");
        System.out.println(s.toString());
        s.insert(1, "222");
        System.out.println(s.toString());
        s.delete(2);
        System.out.println(s.toString());
        System.out.println(s.locate("222"));*/
//        System.out.println(new Integer("123").equals(null));
//        System.out.println("123" == null);

        /*String str = "JD-FU-GT-8L-GS-HU-CN-GX-Y8-UQ-9H-PN-GY-FM-MU-CA-CZ-9C-UQ-AQ";
        String[] chars = str.split("-");
        repetition(chars);*/

        List list = new ArrayList();
        list.get(-1);
    }

    private static Map<String, Integer> repetition(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if(strs[i] == strs[j]) {
                    System.out.println(strs[i] + " " + strs[j]);
                }
            }
        }
        return null;
    }
}

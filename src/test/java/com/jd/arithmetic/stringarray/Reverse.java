package com.jd.arithmetic.stringarray;

import org.junit.Test;

/**
 * Created by lichunran on 2018/6/22.
 */
public class Reverse {


    @Test
    public void reverse() {

        String str = "1234567";
        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        System.out.println(chars);
    }
}

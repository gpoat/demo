package com.jd.arithmetic.stringarray.review;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/11/30.
 */
public class Reverse {

    @Test
    public void test() {
        String str = "12334567";
        System.out.println(reverse(str));
    }

    private String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return chars.toString();
    }
}

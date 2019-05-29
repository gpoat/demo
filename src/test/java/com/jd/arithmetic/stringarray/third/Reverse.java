package com.jd.arithmetic.stringarray.third;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/26.
 */
public class Reverse {

    @Test
    public void test() {
        System.out.println(reverse("123slkjd"));
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

        return new String(chars);
    }

}

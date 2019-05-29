package com.jd.arithmetic.stringarray.third;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/28.
 */
public class ReplaceSpaces {

    @Test
    public void Test() {
        System.out.println(replaceSpace("12 3"));
    }
    // 123 345 8
    private char[] replaceSpace(String str) {

        int spaceCount = 0, newLength;
        //计算新数组长度
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        newLength = str.length() + spaceCount * 2;
        char[] chars = new char[newLength];

        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ' ') {
                chars[newLength - 1] = '0';
                chars[newLength - 2] = '2';
                chars[newLength - 3] = '%';
                newLength -= 3;
            } else {
                chars[newLength - 1] = str.charAt(i);
                newLength -= 1;
            }
        }
        return chars;
    }
}

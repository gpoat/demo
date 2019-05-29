package com.jd.arithmetic.stringarray.review;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/10.
 */
public class ReplaceSpace {

    @Test
    public void test() {
        //10222345 ssdsf sass ssss  ssss
        String str = "10222345 ssdsf sass ssss  ssss";

        System.out.println(repaleceSpace(str));
    }

    private char[] repaleceSpace(String str) {

        char[] chars = str.toCharArray();
        int length = chars.length;
        int spaceCount = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ')
                spaceCount++;
        }

        int newLength = length + spaceCount * 2;
        char[] newChars = new char[newLength];
        for (int i = length - 1; i >= 0 ; i--) {
            if(chars[i] == ' ') {
                newChars[newLength - 1] = '0';
                newChars[newLength - 2] = '2';
                newChars[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                newChars[newLength - 1] = chars[i];
                newLength = newLength - 1;
            }
        }
        return newChars;
    }

}

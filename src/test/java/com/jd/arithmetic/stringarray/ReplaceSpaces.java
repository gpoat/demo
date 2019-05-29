package com.jd.arithmetic.stringarray;


import org.junit.Test;

/**
 * Created by lichunran on 2018/6/26.
 */
public class ReplaceSpaces {
    //[10, 2, 4, 5, "", 90, "", 20, "",10]
    //["","","",""," "," ", "", "", "",""," "," ", "", "", "",10]
    private char[] replace(char[] chars) {

        int length = chars.length;

        int spaceCount = 0, newLength, i;

        for(i = 0; i < chars.length; i++) {
            if(chars[i] == ' ')
                spaceCount++;
        }

        newLength = length + spaceCount * 2;
        char[] newChars = new char[newLength];
        for(i = length - 1; i >= 0; i--) {
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
    @Test
    public void test() {
        char[] chars = "10222345 ssdsf sass ssss  ssss".toCharArray();
        System.out.println(chars);
        System.out.println(replace(chars));
    }

}

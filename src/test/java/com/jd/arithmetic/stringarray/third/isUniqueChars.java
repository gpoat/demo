package com.jd.arithmetic.stringarray.third;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/26.
 */
public class isUniqueChars {

    @Test
    public void test() {
        System.out.println(isUniqueChar("abcdefghhh"));
    }

    public boolean isUniqueChar(String str) {
        if(str.length() > 256)
            return false;
        boolean[] char_set = new boolean[256];
        for(int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }

}

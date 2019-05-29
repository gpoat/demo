package com.jd.arithmetic.stringarray.third;

import org.junit.Test;


/**
 * @author lichunran
 * @date 2018/12/26.
 */
public class SameString {

    @Test
    public void test() {
       char c = 97;
        System.out.println(isSame("aaabbbccdd", "abcabcabdd"));
    }

    private boolean isSame(String str, String t) {

        if(str.length() != t.length())
            return false;

        int[] letters = new int[256];

        for(int i = 0; i < str.length(); i++) {
            letters[str.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++) {
            if(--letters[t.charAt(i)] < 0)
                return false;
        }
        return true;
    }
}

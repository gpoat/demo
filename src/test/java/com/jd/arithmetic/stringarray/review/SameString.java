package com.jd.arithmetic.stringarray.review;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lichunran
 * @date 2018/12/3.
 */
public class SameString {

    @Test
    public void test() {
        String source = "ffffabcdde";
        String target = "ffdcbaffed";
        boolean permutation = permutation(source, target);
        boolean b = permutation1(source, target);
        System.out.println(permutation);
        System.out.println(b);
    }

    private boolean permutation(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] s_array = s.toCharArray();
        int[] letters = new int[256];
        for (char c : s_array) {
            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if(--letters[t.charAt(i)] < 0)
                return false;
        }
        return true;
    }

    private boolean permutation1(String s, String t) {
        if(s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));

    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

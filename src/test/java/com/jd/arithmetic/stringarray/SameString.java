package com.jd.arithmetic.stringarray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lichunran on 2018/6/26.
 */
public class SameString {


    private String sort(String s) {

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        return new String(chars);

    }


    public boolean permutation(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    @Test
    public void test() {

        String s = "1324";

        String t = "4231";

        System.out.println(permutation(s, t));
        System.out.println(permutation1(s, t));

    }

    public boolean permutation1(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256];

        for (char c: s.toCharArray()) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            if(--letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

}

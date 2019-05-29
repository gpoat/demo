package com.jd.arithmetic.stringarray.review;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lichunran on 2018/7/12.
 */
public class IsUniqueChars {

    @Test
    public void test() {
        String str = "abcdeff";
        System.out.println(isUniqueChars2(str));
    }

    private boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }

}

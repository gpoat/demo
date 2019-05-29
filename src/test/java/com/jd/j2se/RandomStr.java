package com.jd.j2se;

/**
 * Created by lichunran on 2017/9/27.
 */
public class RandomStr {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int inVal = (int)(Math.random() * 26 + 97);
            result = result.append((char)inVal);
        }
        System.out.println(result);
    }
}

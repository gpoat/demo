package com.jd.arithmetic.stringarray.review;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/25.
 */
public class CompressString {

    @Test
    public void test() {

        System.out.println(compressBad("aaaabbbbbssd"));
        System.out.println(compressBetter("aaaabbbbbssd"));
        System.out.println(countCompress("aaaabbbbbssd"));

    }

    public String compressBad(String str) {
        String result = "";
        char last = str.charAt(0);
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            if(last == str.charAt(i)) {
                count++;
            } else {
                result += last + "" + count;
                count = 1;
                last = str.charAt(i);
            }
        }
        result += last + "" + count;
        return result;
    }

    public StringBuilder compressBetter(String str) {
        StringBuilder result = new StringBuilder();
        char last = str.charAt(0);
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            if(last == str.charAt(i)) {
                count++;
            } else {
                result = result.append(last).append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        return result.append(last).append(count);
    }

    public int countCompress(String str) {
        int result = 0;
        char last = str.charAt(0);
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
             if(last == str.charAt(i)) {
                 count++;
             } else {
                 result += count;
                 count = 1;
                 last = str.charAt(i);
             }
        }
        return result + count;
    }
}

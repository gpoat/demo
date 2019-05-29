package com.jd.arithmetic.stringarray;

import org.junit.Test;

/**
 * @author lichunran
 * @date 2018/12/10.
 */
public class CompressString {

    @Test
    public void test() {

        String result = compressBad("aaaaabbbccccccccccdddddssseeeeee");
        StringBuilder result1 = compressBetter("aaaaabbbccccccccccdddddssseeeeee");
        int size = countCompress("aaaaabbbccccccccccdddddssseeeeee");

        System.out.println(result);
        System.out.println(result1);
        System.out.println(size);
    }



    private String compressBad(String str) {
        //aaaaabbbccccccccccdddddssseeeeee
        String result = "";

        char last = str.charAt(0);

        int count = 1;
        int i;
        for(i = 1; i < str.length(); i++) {

            if(str.charAt(i) == last) {
                count++;
            } else {
                result += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }

        }

        return result + last + count;
    }

    public StringBuilder compressBetter(String str) {
        //aaaaabbbccc
        int size = countCompress(str);
        if(size >= str.length())
            return null;

        StringBuilder result = new StringBuilder();

        char last = str.charAt(0);

        int count = 1;

        for(int i = 1; i < str.length(); i++) {
            if(last == str.charAt(i)) {
                count++;
            } else {
                result = result.append(last).append(count);
                count = 1;
                last = str.charAt(i);
            }
        }

        return result.append(last).append(count);
    }

    private int countCompress(String str) {
        //aaaaabbbccc
        if(str == null || str.length() == 0)
            return 0;
        char last = str.charAt(0);
        int count = 1;
        int result = 0;
        for(int i = 1; i < str.length(); i++) {
            if(last == str.charAt(i)) {
                count++;
            } else {
                result += count;
                count = 1;
                last = str.charAt(i);
            }
        }
        return result +=count;
    }
}

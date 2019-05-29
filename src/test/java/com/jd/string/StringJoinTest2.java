package com.jd.string;

/**
 * Created by lichunran on 2018/9/18.
 */
public class StringJoinTest2 {

    public static void main(String[] args) {

        String s1 = "Hello Java的长度：10";

        String s2 = "Hello Java" + "的长度：" + "Hello Java".length();

        int len = 10;

        String s3 = "Hello Java的长度：" + len;

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

    }

}

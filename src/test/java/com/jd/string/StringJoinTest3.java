package com.jd.string;

import com.alibaba.fastjson.JSON;

/**
 * Created by lichunran on 2018/9/18.
 */
public class StringJoinTest3 {

    public static void main(String[] args) {

        String s1 = "Hello Java的长度:10";

        final String s = "Hello Java";

        String s2 = s + "的长度:10";

        System.out.println(s1 == s2);

        final int len = 10;

        String s3 = "Hello Java的长度:" + len;

        System.out.println(s1 == s3);

        JSON.toJSONString(s1);
    }

}

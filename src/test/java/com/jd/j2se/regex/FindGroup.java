package com.jd.j2se.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lichunran on 2018/1/29.
 */
public class FindGroup {

    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("\\w*").matcher("java is very easy!");
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        int i = 0;
        while (matcher.find(i)) {
            System.out.println(matcher.group() + "\t");
            i++;
        }
    }
}

package com.jd.j2se.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lichunran on 2018/1/26.
 */
public class validate {

    public static void main(String[] args) {
        /*String regex = "^[\u4e00-\u9fa5]{1,20}$";
        String regex1 = "^[A-Za-z]+/[A-Za-z]+$";
        String name = "li/chunran";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        boolean matches = matcher.matches();
        System.out.println(matches);
        System.out.println("\n");
        String str = "hello , java!";
        System.out.println(str.replaceFirst("\\w*", "∑"));
        System.out.println(str.replaceFirst("\\w*?", "∑"));
        System.out.println(str.replaceFirst("\\w*+", "∑"));*/
        String regex = "\t";
        String name = "/";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(name);
        System.out.println(matcher.matches());
    }
}

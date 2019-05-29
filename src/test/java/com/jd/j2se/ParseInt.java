package com.jd.j2se;

/**
 * Created by lichunran on 2017/9/27.
 */
public class ParseInt {
    public static void main(String[] args) {
        String a = "45";
        Integer i = Integer.parseInt(a);
        System.out.println(i instanceof Integer);
        //++test
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }
}

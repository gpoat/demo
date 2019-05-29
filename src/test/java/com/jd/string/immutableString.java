package com.jd.string;

/**
 * Created by lichunran on 2018/9/19.
 */
public class immutableString {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(System.identityHashCode(str));

        str = str + "Java";

        System.out.println(System.identityHashCode(str));

        str = str + ", I am a programmer.";

        System.out.println(System.identityHashCode(str));



    }

}

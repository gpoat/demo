package com.jd.arithmetic.stringarray;

/**
 * Created by lichunran on 2018/4/10.
 */
public class IsUniqueChars {


    public static void main(String[] args) {
        int i = '好';
        System.out.println(i);
        String asciiStr = "asbnkljdml";
        System.out.println(isUniqueChars2(asciiStr));
    }


    public static boolean isUniqueChars2(String str) {

        if(str.length() > 256)
            return false;
        boolean[] char_set = new boolean[256];

        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val] == true)
                return false;
            char_set[val] = true;
        }
        return true;
    }

    public boolean isUniqueChars(String str) {

        return str.length() <= 26;
    }
}

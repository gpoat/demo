package com.jd.j2se.encode;

import java.io.UnsupportedEncodingException;

/**
 * Created by lichunran on 2018/1/24.
 */
public class EncodeToGBK {

    public static void main(String[] args) {
        String code = toGBK("䶟");
        System.out.println(code);
    }

    public static String toGBK(String source) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[0];
        try {
            bytes = source.getBytes("gb18030");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (byte b : bytes) {
            sb.append("%" + Integer.toHexString((b & 0xff)).toUpperCase());
        }
        return sb.toString();
    }


}

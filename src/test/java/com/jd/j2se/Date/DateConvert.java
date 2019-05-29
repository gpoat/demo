package com.jd.j2se.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lichunran on 2017/11/29.
 */
public class DateConvert {
    public static void main(String[] args) {
        Date date = new Date("Tue Jun 28 00:00:00 CST 2016");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        try {
            Date parse = simpleDateFormat.parse("2017-12-05 10:47:55");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(format);
    }
}

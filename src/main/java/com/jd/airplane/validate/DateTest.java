package com.jd.airplane.validate;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lichunran on 2018/4/4.
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {

        /*Date date = new Date();
        boolean b = checkDate();
        System.out.println(date1);
        System.out.println(b);
        long l = System.currentTimeMillis();
        Date date1 = new Date();
        boolean after = date.after(date1);
        System.out.println(after);
        System.out.println(date.toString());
        Date date1 = DateUtils.addYears(new Date(), 18);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-HH-mm");
        System.out.println(simpleDateFormat.format(date1));*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(new Date()));
        Date date = DateUtils.addYears(new Date(), 18);
        System.out.println(simpleDateFormat.format(date));
        List<String> list = new ArrayList<String>();
        list.add("1,4");
        list.add("2,3");
        System.out.println(JSON.toJSONString(list));

    }

    private static boolean checkDate() throws ParseException {
        boolean flag = false;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Date startDate = format.parse("2018-04-10 00:00:00");
        Date endDate = format.parse("2018-04-10 23:59:59");
        if(now.before(endDate) && now.after(startDate)) {
            flag = true;
        }
        return flag;
    }
}

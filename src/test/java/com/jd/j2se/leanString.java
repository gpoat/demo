package com.jd.j2se;

import com.jd.SimpleRPC.provider.SayHelloService;
import com.jd.SimpleRPC.provider.impl.SayHelloServiceImpl;
import com.jd.thread.ThreadLocalTest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by lichunran on 2017/9/28.
 */
public class leanString {
    public static void main(String[] args) {
        String entrance = new String("123");

        String date = "2014-07-19 00:00:00";
        String substring = date.substring(0, 10);
        System.out.println(substring);

        String time = "1105";
        String timeSub = time.substring(2, 4);
        System.out.println(timeSub);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            simpleDateFormat.parse("2017-11-23");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        threadLocalTest.getNum();

        SayHelloService sayHelloService = new SayHelloService() {
            public String sayHello(String helloArgs) {
                return "hello";
            }
        };


        String s = sayHelloService.sayHello("1");
        System.out.println(s);
        System.out.println(SayHelloService.i);
        String name = "李春然";
        System.out.println(name.charAt(0));
        try {
            byte[] gbks = name.getBytes("GBK");
            for(int i = 0; i < gbks.length; i++) {
                System.out.println(gbks[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double d1 = 0.05;
        double d2 = 0.01;
        System.out.println(d1 + d2);
        InitTest initTest = new InitTest();
//        System.out.println(initTest.getName());
        System.out.println(initTest.getPrice().add(null));
        BigDecimal b1 = BigDecimal.ZERO;
        BigDecimal b2 = BigDecimal.valueOf(6);
        System.out.println(b1.add(b2));
        System.out.println(b2.add(b1));
    }
}


class InitTest {
    private String name;

    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
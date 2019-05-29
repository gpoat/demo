package com.jd.j2se;

import org.junit.Test;

/**
 * Created by lichunran on 2018/1/15.
 */
public class MethodTest {

    @Test
    public void methodArgsTest() {
//        String arg0 = "1";
//        String arg1 = "2";
//        sum(arg0, null);
        /*int i = 0;
        if(i == 1 && i++ == 3) {
        }
        System.out.println(i);*/
        if(null != "123")
            System.out.println("123");
    }

    private void sum(String arg0, String arg1) {
        System.out.println(arg0 + arg1);
    }
}

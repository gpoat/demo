package com.jd.stackoverflow;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by lichunran on 2018/5/3.
 */
public class Test {

    private static final Log log = LogFactory.getLog(Test.class);

    @org.junit.Test
    public void test() {

        Person p = new Person();
        try{
            log.info("stack overflow test : " + JSON.toJSONString(p));
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}

class Person {

    public byte[] bytes = new byte[1024 * 1024 * 10];

}

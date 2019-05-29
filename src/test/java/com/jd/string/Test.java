package com.jd.string;

/**
 * @author lichunran
 * @date 2018/12/28.
 */
public class Test {

    @org.junit.Test
    public void test() {
        stringbuildJoin();
        stringJoin();
        stringConcatJoin();
    }

    public void stringJoin() {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "1";
        }
        long end = System.currentTimeMillis();
        System.out.println("String:" + (end - start));
    }

    public void stringbuildJoin() {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("1");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder:" + (end - start));
    }

    public void stringConcatJoin() {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str.concat("1");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringConcat:" + (end - start));
    }
}

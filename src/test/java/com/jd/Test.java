package com.jd;


import java.math.BigDecimal;

/**
 * Created by lichunran on 2018/4/26.
 */
public class Test {

    @org.junit.Test
    public void test() {
        System.out.println("123");
        System.out.println('\0');
        System.out.println("123");
    }

    private String convert(String imageUrl, int type) {

        //默认图片长度为1500，宽度为188
        BigDecimal originLength = new BigDecimal("1500");
        BigDecimal originWidth = new BigDecimal("188");
        BigDecimal base = new BigDecimal("4");
        BigDecimal multiple = new BigDecimal(type);

        BigDecimal quotient = multiple.divide(base);
        BigDecimal resultLength = originLength.multiply(quotient).setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal resultWidth = originWidth.multiply(quotient).setScale(0,  BigDecimal.ROUND_DOWN);
        StringBuilder imageSize = new StringBuilder("s").append(resultLength).append("x").append(resultWidth).append("_jfs");
        String target = "jfs";
        String replace = imageUrl.replace(target, imageSize);
        return replace;
    }

}



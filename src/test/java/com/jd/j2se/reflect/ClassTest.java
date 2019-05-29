package com.jd.j2se.reflect;

/**
 * Created by lichunran on 2017/12/15.
 */
@SuppressWarnings("unchecked")
@Deprecated
public class ClassTest {

    private String name;

    private ClassTest() {

    }

    public ClassTest(String name) {
        System.out.println("有参构造函数");
    }

    public void info() {
        System.out.println("执行无参的info方法。");
    }

    public void info(String str) {
        System.out.println("执行有参的info方法，参数为" + str);
    }

    class Inner {

    }

    public void setName(String name) {
        this.name = name;
    }
}

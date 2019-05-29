package com.jd.j2se.reflect;

/**
 * Created by lichunran on 2018/9/3.
 */
public class Person {

    private String name;

    private int age;

    public void speak() {
        System.out.println("hello, I am " + name==null?name:null);
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

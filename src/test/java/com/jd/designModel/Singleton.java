package com.jd.designModel;

import org.junit.Test;

/**
 * Created by lichunran on 2017/12/29.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }
}


class SingletonTest{

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
package com.jd.designModel.singleton;

/**
 * Created by lichunran on 2017/12/29.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}


class  LazySingletonTest {

    public static void main(String[] args) {

        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1 == l2);
        System.out.println(l1);
        System.out.println(l2);
    }
}
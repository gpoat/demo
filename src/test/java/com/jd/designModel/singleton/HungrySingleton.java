package com.jd.designModel.singleton;

/**
 * Created by lichunran on 2017/12/29.
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}



class HungrySingletonTest {

    public static void main(String[] args) {

        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();

        System.out.println(h1 == h2);
        System.out.println(h1);
        System.out.println(h2);
    }
}

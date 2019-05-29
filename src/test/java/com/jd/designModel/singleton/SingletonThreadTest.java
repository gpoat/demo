package com.jd.designModel.singleton;

/**
 * Created by lichunran on 2017/12/29.
 */
public class SingletonThreadTest implements Runnable {

    public void run() {
        System.out.println(LazySingleton.getInstance().hashCode());
    }




}

package com.jd.designModel.strategy.quack.impl;

import com.jd.designModel.strategy.quack.QuackBehavior;

/**
 * Created by lichunran on 2018/4/14.
 */
public class Squeak implements QuackBehavior {


    public void quack() {
        System.out.println("squeak");
    }
}

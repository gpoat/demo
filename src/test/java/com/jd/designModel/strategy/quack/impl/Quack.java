package com.jd.designModel.strategy.quack.impl;

import com.jd.designModel.strategy.quack.QuackBehavior;

/**
 * Created by lichunran on 2018/4/12.
 */
public class Quack implements QuackBehavior {


    public void quack() {
        System.out.println("quack");
    }
}

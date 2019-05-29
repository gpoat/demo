package com.jd.designModel.strategy.fly.impl;

import com.jd.designModel.strategy.fly.FlyBehavior;

/**
 * Created by lichunran on 2018/4/11.
 */
public class FlyNoWay implements FlyBehavior {


    public void fly() {
        System.out.println("I cant fly!");
    }
}

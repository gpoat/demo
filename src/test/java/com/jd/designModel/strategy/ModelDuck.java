package com.jd.designModel.strategy;

import com.jd.designModel.strategy.fly.impl.FlyNoWay;
import com.jd.designModel.strategy.quack.impl.Quack;

/**
 * Created by lichunran on 2018/4/28.
 */
public class ModelDuck extends Duck{

    public void ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    public void display() {
        System.out.println("I'm a model duck!");
    }
}

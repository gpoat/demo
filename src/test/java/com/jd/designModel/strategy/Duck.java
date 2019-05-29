package com.jd.designModel.strategy;

import com.jd.designModel.strategy.fly.FlyBehavior;
import com.jd.designModel.strategy.quack.QuackBehavior;

/**
 * Created by lichunran on 2018/4/11.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all duck float, even decoy");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

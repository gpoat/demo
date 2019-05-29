package com.jd.designModel.strategy;

import com.jd.designModel.strategy.fly.impl.FlyRocketPowered;
import com.jd.designModel.strategy.fly.impl.FlyWithWing;
import com.jd.designModel.strategy.quack.impl.Quack;

/**
 * Created by lichunran on 2018/4/25.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}


class miniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();

        mallard.performFly();

        Duck model = new ModelDuck();

        model.performQuack();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();
    }

}
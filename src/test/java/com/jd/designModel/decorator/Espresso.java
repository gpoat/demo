package com.jd.designModel.decorator;

/**
 * Created by lichunran on 2018/9/19.
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

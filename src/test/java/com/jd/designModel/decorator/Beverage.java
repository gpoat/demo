package com.jd.designModel.decorator;

/**
 * Created by lichunran on 2018/9/19.
 */
public abstract class Beverage {

    String description = "Unkown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}

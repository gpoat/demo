package com.jd.designModel.factory.simplefactory;

/**
 * @author lichunran
 * @date 2018/11/8.
 */
public class GreekPizza implements Pizza {
    public void prepare() {
        System.out.println("GreekPizza preparing");
    }

    public void bake() {
        System.out.println("GreekPizza baking");
    }

    public void cut() {
        System.out.println("GreekPizza cutting");
    }

    public void box() {
        System.out.println("GreekPizza boxing");
    }
}

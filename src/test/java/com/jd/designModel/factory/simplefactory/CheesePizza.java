package com.jd.designModel.factory.simplefactory;

/**
 * @author lichunran
 * @date 2018/11/8.
 */
public class CheesePizza implements Pizza {
    public void prepare() {
        System.out.println("CheesePizza preparing");
    }

    public void bake() {
        System.out.println("CheesePizza baking");
    }

    public void cut() {
        System.out.println("CheesePizza cuting");
    }

    public void box() {
        System.out.println("CheesePizza boxing");
    }
}

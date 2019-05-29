package com.jd.designModel.factory.factorymethod;

/**
 * @author lichunran
 * @date 2018/11/26.
 */
public abstract class PizzaStore {

    public void orderPizza() {
        
    }

    abstract Pizza createPizza(String type);
}

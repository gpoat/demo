package com.jd.designModel.factory.simplefactory;

/**
 * @author lichunran
 * @date 2018/11/8.
 */
public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }


}

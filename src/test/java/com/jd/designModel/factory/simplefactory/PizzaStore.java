package com.jd.designModel.factory.simplefactory;

/**
 * @author lichunran
 * @date 2018/11/8.
 */
public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String style) {

        Pizza pizza = simplePizzaFactory.createPizza(style);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

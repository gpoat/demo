package com.jd.designModel.factory.simplefactory;

/**
 * @author lichunran
 * @date 2018/11/8.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.setSimplePizzaFactory(new SimplePizzaFactory());

        pizzaStore.orderPizza("cheese");
    }

}

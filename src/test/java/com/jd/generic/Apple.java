package com.jd.generic;

/**
 * Created by lichunran on 2018/5/23.
 */
public class Apple<T> {

    private T info;

    public Apple() {}

    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple<String> apple = new Apple<String>("苹果");
        System.out.println(apple.getInfo());
        Apple<Double> apple1 = new Apple<Double>(4.56);
        System.out.println(apple1.getInfo());
    }
}

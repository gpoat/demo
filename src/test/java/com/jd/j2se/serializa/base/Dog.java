package com.jd.j2se.serializa.base;

import java.io.Serializable;

/**
 * Created by lichunran on 2017/9/29.
 */
public class Dog implements Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.jd.j2se.serializa.base;

import java.io.Serializable;

/**
 * Created by lichunran on 2018/10/15.
 */
public class Animal {

    private static final long serialVersionUID = -165747264546945586L;

    private String species;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

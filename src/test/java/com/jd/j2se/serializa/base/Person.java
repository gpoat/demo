package com.jd.j2se.serializa.base;

import com.jd.j2se.serializa.base.Dog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by lichunran on 2017/9/28.
 */
public class Person extends Animal implements Serializable {

    private static final long serialVersionUID = -165747264546945587L;

    private String name;

    private transient int age;

    private String sex;
    
    private String phone;

    private List<Dog> pet;

    private Map<String, Object> map;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<Dog> pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Dog> getPet() {
        return pet;
    }

    public void setPet(List<Dog> pet) {
        this.pet = pet;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}

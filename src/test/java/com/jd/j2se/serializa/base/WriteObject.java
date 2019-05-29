package com.jd.j2se.serializa.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichunran on 2017/9/28.
 */
public class WriteObject {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("object1.txt"));
            Dog daHa = new Dog("大哈");
            Dog erHa = new Dog("二哈");
            List<Dog> pets = new ArrayList<Dog>();
            pets.add(daHa);
            pets.add(erHa);
            Person zhangSan = new Person("张三", 23, pets);
            zhangSan.setSex("male");
            zhangSan.setSpecies("人类");
            objectOutputStream.writeObject(zhangSan);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

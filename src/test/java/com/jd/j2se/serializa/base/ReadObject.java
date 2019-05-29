package com.jd.j2se.serializa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by lichunran on 2017/9/29.
 */
public class ReadObject {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("object1.txt"));
            Person zhangSan = (Person)objectInputStream.readObject();
            System.out.println("名字为：" + zhangSan.getName() + "\n年龄为：" + zhangSan.getAge() + "\n物种为:" + zhangSan.getSpecies());
            System.out.println(zhangSan.getSex());
            List<Dog> pets = zhangSan.getPet();
            for(Dog pet : pets) {
                System.out.println("宠物：" + pet.getName());
            }
//            System.out.println(Inet4Address.getByName("i.jsf.jd.com"));
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

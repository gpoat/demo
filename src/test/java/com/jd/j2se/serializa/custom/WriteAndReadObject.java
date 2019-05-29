package com.jd.j2se.serializa.custom;

import java.io.*;

/**
 * Created by lichunran on 2017/9/29.
 */
public class WriteAndReadObject {

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("WriteAndReadObject.txt"));
            Person zhangSan = new Person("张三", 22);
            objectOutputStream.writeObject(zhangSan);
            objectInputStream = new ObjectInputStream(new FileInputStream("WriteAndReadObject.txt"));
            Person zhangSanRead = (Person)objectInputStream.readObject();
            System.out.println("名字为：" + zhangSanRead.getName() + "\n年龄为：" + zhangSanRead.getAge());
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.jd.j2se.serializa;

import com.jd.j2se.serializa.base.Dog;
import com.jd.j2se.serializa.base.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichunran on 2017/9/29.
 */
public class SerializeMutable {

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
//            objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
//
//            Person liSi = new Person("李四", 23);
//            Dog shapi = new Dog("沙皮");
//            List<Dog> dogs = new ArrayList<Dog>();
//            dogs.add(shapi);
//            liSi.setPet(dogs);
//            Map<String, Integer> map = new HashMap<String, Integer>();
//            map.put("1", 1);
//            liSi.setMap(map);
//            objectOutputStream.writeObject(liSi);
//            liSi.setName("王二");
//            objectOutputStream.writeObject(liSi);

            objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
            Person liSiRead = (Person)objectInputStream.readObject();
            System.out.println(liSiRead.getName());
            Person liSiModify = (Person) objectInputStream.readObject();
            System.out.println(liSiModify.getName());
            System.out.println(liSiModify == liSiRead);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

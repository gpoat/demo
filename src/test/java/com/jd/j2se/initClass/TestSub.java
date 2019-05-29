package com.jd.j2se.initClass;

import com.jd.j2se.serializa.base.Dog;
import com.jd.j2se.serializa.base.Person;
import org.junit.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichunran on 2017/11/2.
 */
public class TestSub {
    public static void main(String[] args) {
        Person p = new Person();
        List<Dog> pet = p.getPet();
        Dog dog = new Dog("erha");
        pet.add(dog);
        String name = pet.get(0).getName();
        System.out.println(name);
    }


    @org.junit.Test
    public void bigDecimalTest() {
        Demo demo = new Demo();
        new BigDecimal(demo.l);
    }

    //map取不存在key测试
    @org.junit.Test
    public void MapTest() {
        Map<String, String> test = new HashMap<String, String>();
        System.out.println(test.get("fruit"));
    }

}

class Demo {
    Long l;
}

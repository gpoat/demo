package com.jd.j2se.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by lichunran on 2018/9/3.
 */
public class FiedTest {

    @Test
    public void testReflectField() throws Exception {

        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();

        Field name = clazz.getDeclaredField("name");

        name.setAccessible(true);

        name.set(person, "zhangsan");

        System.out.println(person.getName());

    }

}

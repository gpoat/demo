package com.jd.j2se.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lichunran on 2017/12/15.
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        Class<ClassTest> clazz = ClassTest.class;
        Constructor<ClassTest> constructor1 = clazz.getConstructor(String.class);
        ClassTest instanceTom = constructor1.newInstance("tom");
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println(clazz.getName() + "的全部构造函数如下：");
        for(Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        Method info = clazz.getMethod("info", String.class);

        Object invoke = info.invoke(instanceTom,"123");

    }
}

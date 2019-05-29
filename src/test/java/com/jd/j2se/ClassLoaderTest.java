package com.jd.j2se;

import sun.misc.Launcher;

import java.net.URL;

/**
 * Created by lichunran on 2018/5/31.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();

        for(int i = 0; i < urLs.length; i++) {
            System.out.println(urLs[i].toExternalForm());
        }

        ClassLoader.getSystemClassLoader();

        System.out.println(1 << 30);
    }
}

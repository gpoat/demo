package com.jd.j2se.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lichunran on 2017/12/25.
 */
public class AtomicTest {

    private static AtomicInteger race = new AtomicInteger(0);

    public static void increase() {
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for(int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        AtomicTest.increase();
                    }
                }
            });
            threads[i].start();
        }
        while(Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(race);
    }
}

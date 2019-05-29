package com.jd.j2se.concurrent;

/**
 * Created by lichunran on 2017/12/20.
 */
public class volatileTest {

    public static volatile int race;

    public static void increase() {
        race++;
    }

    public static final int THREAD_COUNTS = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNTS];
        for(int i = 0; i < THREAD_COUNTS; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while(Thread.activeCount() > 2){
            /*Thread[] list = new Thread[100];
            System.out.println(Thread.currentThread().getThreadGroup().enumerate(list));
            for(Thread thread: list) {
                System.out.println(thread);
            }
            System.out.println("----------");*/
            Thread.yield();
        }
        System.out.println(race);
    }
}

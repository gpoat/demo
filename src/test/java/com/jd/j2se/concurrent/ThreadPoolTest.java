package com.jd.j2se.concurrent;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lichunran on 2017/12/20.
 */
public class ThreadPoolTest {

    @Test
    public void bootstrap() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Thread(new ThreadTest()));
        executorService.submit(new Thread(new ThreadTest()));
        executorService.submit(new Thread(new ThreadTest()));
        executorService.submit(new Thread(new ThreadTest()));
    }
}

class ThreadTest implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("this is " + Thread.currentThread().getName() + "-" + i);
        }
    }
}

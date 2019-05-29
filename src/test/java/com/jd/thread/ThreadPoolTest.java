package com.jd.thread;

import org.apache.ibatis.executor.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lichunran on 2018/6/26.
 */
public class ThreadPoolTest {


    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        pool.submit(new Count());
        pool.submit(new Count());
        System.out.println(pool.isTerminated());
        pool.shutdown();
    }

}


class Count implements Runnable {


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {

        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package com.jd.thread;

/**
 * Created by lichunran on 2017/11/11.
 */
public class ThreadLocalTest {

    private ThreadLocal<Integer> number = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNum() {
        number.set(number.get() + 1);
        return number.get();
    }

    public static void main(String[] args) {

        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        new Thread(new NumberIncreaseTest(threadLocalTest)).start();
        new Thread(new NumberIncreaseTest(threadLocalTest)).start();
        new Thread(new NumberIncreaseTest(threadLocalTest)).start();
    }

}


class NumberIncreaseTest implements Runnable {

    private ThreadLocalTest threadLocalTest;

    public NumberIncreaseTest(ThreadLocalTest threadLocalTest) {
        this.threadLocalTest = threadLocalTest;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + threadLocalTest.getNum());
        }
    }
}
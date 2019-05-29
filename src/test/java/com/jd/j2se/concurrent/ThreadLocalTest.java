package com.jd.j2se.concurrent;

/**
 * Created by lichunran on 2018/2/24.
 */
//测试ThreadLocal放多个值
class Account {

    private ThreadLocal<String> name = new ThreadLocal<String>();

    public Account(String name) {
        this.name.set(name);
        System.out.println("----" + getName());
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getName() {
        return this.name.get();
    }
}

class MyTest extends Thread {

    private Account account;

    public MyTest(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i == 6) {
                this.account.setName(getName());
            }
            System.out.println(account.getName() + "账户i的值为：" + i);
        }
    }
}

public class ThreadLocalTest {

    public static void main(String[] args) {
        Account account = new Account("初始化");
        new MyTest(account, "线程甲").start();
        new MyTest(account, "线程乙").start();
    }
}
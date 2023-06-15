package com;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(2,100000);
        MyThread thread2 = new MyThread(100000,200000);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}

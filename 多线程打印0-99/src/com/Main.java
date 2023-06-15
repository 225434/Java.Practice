package com;

public class Main {
    public static void main(String[] args) {
        System.out.println("20201101289 袁云昊");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}

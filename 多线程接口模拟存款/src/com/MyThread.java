package com;

public class MyThread implements Runnable{
//    Saving saving;
//    String name;
//
//    public MyThread(Saving saving,String name) {
//        this.saving = saving;
//        this.name = name;
//    }

    static int saving=0;

    public void run() {
        synchronized (this) {
            saving += 100;
            System.out.println(Thread.currentThread().getName()+ "已存款100元！当前余额为：" + saving);
        }
    }
}

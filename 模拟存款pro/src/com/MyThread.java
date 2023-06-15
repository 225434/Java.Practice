package com;

public class MyThread implements Runnable{
    Saving saving;

    public MyThread(Saving saving) {
        this.saving = saving;
    }

    public void run() {
        synchronized (this) {
            saving.number += 100;
            System.out.println(Thread.currentThread().getName() + "已存款100元！当前余额为：" + saving.number);
        }
    }
}

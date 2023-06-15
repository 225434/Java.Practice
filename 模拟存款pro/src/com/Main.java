package com;

public class Main {
    public static void main(String[] args) {
        Saving saving = new Saving(0);
        MyThread person = new MyThread(saving);
        int i = 0;
        while (i < 3) {
            new Thread(person,"customer1").start();
            new Thread(person,"customer2").start();
            i++;
        }
    }
}

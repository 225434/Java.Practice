package com;

public class MyThread extends Thread{
    int number = 0;
    public void run() {
        while(number<100) {
            System.out.println(number);
            number++;
        }
    }
}

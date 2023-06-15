package com;

public class MyThread implements Runnable{
    int a,b;
    int count = 0;
    Prime num = new Prime();

    public MyThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        for (int i = a; i <= b ; i++) {
            if( num.chick(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}



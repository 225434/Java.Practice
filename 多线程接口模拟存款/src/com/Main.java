package com;

public class Main {
    public static void main(String[] args){
//        Saving saving = new Saving(0);
//        static int saving = 0;
        MyThread myThread = new MyThread();
//new Thread(myThread,"A");
//new Thread(myThread,"B");

//        MyThread person1 = new MyThread();
//        Thread customer1 = new Thread(person1);
//        MyThread person2 = new MyThread();
//        Thread customer2 = new Thread(person2);
        int i = 0;
        while (i < 3) {
            new Thread(myThread,"A").start();
            new Thread(myThread,"B").start();
            new Thread(myThread,"C").start();
            new Thread(myThread,"D").start();
            new Thread(myThread,"E").start();
//            customer1.start();
//            customer2.start();
            i++;
        }
    }
}

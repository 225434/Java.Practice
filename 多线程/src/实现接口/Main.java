package 实现接口;

import 继承.MyThread;

public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread("C")).start();
        new Thread(new MyThread("D")).start();
    }
}

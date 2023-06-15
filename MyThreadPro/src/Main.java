public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread1");
        MyThread t2 = new MyThread("MyThread2");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
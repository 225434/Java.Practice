public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("MyThread1");
        MyThread thread2 = new MyThread("MyThread2");
        thread1.setPriority(6);
        thread2.setPriority(7);
        thread1.start();
        thread2.start();
    }
}
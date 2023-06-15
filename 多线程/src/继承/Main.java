package 继承;

public class Main {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        a.start();
        b.start();
    }
}

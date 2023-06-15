package 继承;

public class MyThread extends Thread{
    String name;
    static boolean lock = true;
    int count = 0;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0;i < 4;i++) {
            while (!lock) {
                count++;
            }
            lock = false;
            System.out.println(name+ " 输出：" + i);
            lock = true;
        }
    }
}

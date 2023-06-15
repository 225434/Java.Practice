package 实现接口;

public class MyRunnable implements Runnable{
    String name;
    static boolean lock = true;
    int count;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0;i < 4;i++) {
            while (!lock) {
                count++;
            }
            lock = false;
            System.out.println(name + " 输入：" + i);
            lock = true;
        }
    }
}

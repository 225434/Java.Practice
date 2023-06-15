public class MyThread implements Runnable{
    String str = null;

    public MyThread(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("输入参数是" + str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

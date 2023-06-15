public class 多线程学习 {
    static class MyThread extends Thread {
        private String str;

        public MyThread() {
            super();
        }

        public MyThread(String name) {
            this.str = name;
        }

        //重写进程的run方法
        public void run() {



            System.out.println(this.str);

        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("1");
        MyThread t2 = new MyThread("2");
        int flag=0;
        while (flag<100) {
            t1.run();
            t2.run();
            flag++;

        }

    }


}

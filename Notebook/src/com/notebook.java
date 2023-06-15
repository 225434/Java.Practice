package com;

import java.util.Scanner;

public  class notebook {
    public static void menu() {  //菜单打印
        System.out.println("1.新建文件");
        System.out.println("2.打开文件");
        System.out.println("3.修改文件");
        System.out.println("4.保存");
        System.out.println("5.退出");
    }

    public static void main(String[] args) throws Exception{
        System.out.println("20201101289 袁云昊");
        menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入指令:");
        int choose = sc.nextInt();
        byte[] buff = new byte[1024];
        while (true) {
            switch (choose) {
                case 1: //新建
                {
                    built b = new built();
                    buff=b.create();
                    break;
                }
                case 2: //打开
                {
                    open o = new open();
                    o.on();
                    break;
                }
                case 3: //修改
                {
                    revise r = new revise();
                    r.re();
                    break;
                }
                case 4: //保存
                {
                    save s = new save();
                    s.conserve(buff);
                    break;
                }
                case 5: //退出
                {
                    System.out.println("已退出系统！");
                    break;
                }
            }
            if(choose!=5)
                System.out.println("请输入指令:");
            if(choose == 5)
                break;
            choose = sc.nextInt();
        }
    }
}

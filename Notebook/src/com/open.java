package com;

import java.io.*;
import java.util.Scanner;

public class open{
    public void on() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打开文件的地址：");
        String path = sc.next();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("该文件不存在！");
        } else {
            FileInputStream in = new FileInputStream(file);
            int len;
            byte[] buff = new byte[1024];
            while ((len = in.read(buff)) != -1) {
                String str = new String(buff, 0, len);
                System.out.println("从文件中读取的内容是：" + str);
            }
            in.close();
        }
    }
}

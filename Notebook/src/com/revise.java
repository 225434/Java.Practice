package com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class revise {
    public void re() throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner content = new Scanner(System.in);
        System.out.println("请输入文件地址：");
        String path = sc.next();
        File file = new File(path);
        if(!file.exists()) {
            System.out.println("该文件不存在！");
        } else {
            FileOutputStream out = new FileOutputStream(file);
            System.out.println("请输入修改后的内容：");
            String str = content.nextLine();
            out.write(str.getBytes());
            out.close();
        }
    }
}

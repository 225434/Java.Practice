package com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class save {
    public void conserve(byte[] content) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件地址：");
        String path = sc.next();
        File file = new File(path);
        FileOutputStream out = new FileOutputStream(file);
        out.write(content,0,content.length);
        System.out.println("文件已保存！");
        out.close();
    }
}

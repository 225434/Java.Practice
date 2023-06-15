package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Text {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("C:\\Users\\86199\\Desktop\\java\\粘贴\\picture.jpg");
        OutputStream out = new FileOutputStream("C:\\Users\\86199\\Desktop\\java\\粘贴\\news\\picture.jpg");
        byte[] buff = new byte[1024];
        long begin = System.currentTimeMillis();
        while(in.read(buff,0, buff.length)!=-1){
            out.write(buff,0, buff.length);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件复制消耗的时间为："+(end-begin));
        in.close();
        out.close();
    }
}

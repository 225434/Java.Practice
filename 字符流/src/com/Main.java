package com;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("Note/note.txt");
        Reader in = new FileReader(file);
        Writer out = new FileWriter(file);
        BufferedReader read = new BufferedReader(in);
        BufferedWriter write = new BufferedWriter(out);
        System.out.println("输入内容:");
        Scanner sc = new Scanner(System.in);
        String content =sc.nextLine();
        write.write(content);
        write.close();
        String str;
        System.out.println("文件内容为:");
        while ((str=read.readLine())!=null) {
            System.out.println(str);
        }
        read.close();
    }
}

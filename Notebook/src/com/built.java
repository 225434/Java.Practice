package com;

import java.util.Scanner;

public class built {
    public byte[] create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件内容：");
        String str = sc.nextLine();
        return str.getBytes();
    }
}

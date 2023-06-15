package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女司机姓名：");
        FemaleDriver fe=new FemaleDriver(sc.next());
        System.out.println("请输入男司机姓名：");
        MaleDriver ma=new MaleDriver(sc.next());
        fe.drives();
        ma.drives();
    }
}

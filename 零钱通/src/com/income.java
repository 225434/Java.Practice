package com;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Income {
    int income;
    Money money;


    public Income(Money money) {
        this.money = money;
    }

    String input() {
        System.out.println("输入要存储的金额：");
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        money.saving += income;
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "收益入账 +" + income + "元\t" + localDate + "\t" + localTime.format(formatter) + "\t余额：" + money.saving;
    }
}

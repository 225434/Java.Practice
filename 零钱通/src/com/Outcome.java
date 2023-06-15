package com;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Outcome {
    int outcome;
    Money money;
    String good;

    public Outcome(Money money) {
        this.money = money;
    }

    String output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入花钱项：");
        good = sc.next();
        System.out.println("输入消费金额：");
        outcome = sc.nextInt();
        if(outcome > money.saving) {
            System.out.println("余额不足");
            return null;
        }
        else {
            money.saving -= outcome;
            LocalDate localDate = LocalDate.now();
            LocalTime localTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            return "出账：" + good + " -" + outcome + "元\t" + localDate + "\t" + localTime.format(formatter) + "\t余额：" + money.saving;
        }
    }
}

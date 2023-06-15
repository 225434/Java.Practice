package com;

import java.util.Scanner;

public class Main {
    public static void menu() {
        String menu = "----------零钱通----------\n"
                + "\t1.零钱通明细\n"
                + "\t2.收益入账\n"
                + "\t3.消费\n"
                + "\t4.退出";
        System.out.println(menu);
        System.out.println("请选择（1-4）");
    }

    public static String[] extend(String[] array) {
        int len = array.length;
        if (array[len - 1] != null) {
            String[] new_array = new String[len + 5];
            System.arraycopy(array,0,new_array,0,len);
            return new_array;
        }
        else
            return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        menu();
        Money money = new Money(0);
        String[] items = new String[1];
        int choose = sc.nextInt();
        while(0 < choose && choose < 4) {
            switch (choose) {
                case 1:
                    if(items[0] == null) {
                        System.out.println("还没有项目！");
                    }
                    else {
                        for(String a:items)
                        {
                            if(a == null)
                                break;
                            System.out.println(a);
                        }
                    }
                    break;
                case 2:
                    Income income = new Income(money);
                    items = extend(items);
                    items[count++] = income.input();
                    break;
                case 3:
                    Outcome outcome = new Outcome(money);
                    items = extend(items);
                    items[count++] = outcome.output();
                    break;
            }
            System.out.println("\n\t请选择（1-4）");
            choose = sc.nextInt();
        }
    }
}

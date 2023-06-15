package com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bus bus=new Bus();
        Taxi taxi=new Taxi();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入公交车采用的刹车技术和车票价（元）：");
        bus.setWay(sc.next());
        bus.setFare(sc.next());
        System.out.println("请输入出租车采用的刹车技术、车票价（元）、安装的空调样式：");
        taxi.setWay(sc.next());
        taxi.setFare(sc.next());
        taxi.setMode(sc.next());
        bus.brake(bus.getWay());
        bus.charge(bus.getFare());
        taxi.brake(taxi.getWay());
        taxi.charge(taxi.getFare());
        taxi.controlAirTemperature(taxi.getMode());
    }
}

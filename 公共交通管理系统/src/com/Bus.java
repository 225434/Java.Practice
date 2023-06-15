package com;

public class Bus extends MotorVehicles implements MoneyFare{
    public void brake(String s) {
        System.out.println("公共汽车使用的刹车技术："+s);
    }

    public void charge(String c) {
        System.out.println("公共汽车："+c+"元/张，不计算公里数");
    }
}

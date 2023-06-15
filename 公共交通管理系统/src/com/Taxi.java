package com;

public class Taxi extends MotorVehicles implements MoneyFare,ControlTemperature{
    String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void brake(String s) {
        System.out.println("出租车使用的刹车技术："+s);
    }

    public void charge(String c) {
        System.out.println("出租车："+c+"元/公里，起步价3公里");
    }

    public void controlAirTemperature(String t) {
        System.out.println("出租车安装了"+t+"空调");
    }
}

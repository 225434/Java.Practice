package com;

public class Beyond extends Exception{
    int age;

    public Beyond(int age) {
        this.age = age;
    }

    @Override
    public String getMessage() {
        System.out.println("大了");
        return super.getMessage();
    }
}

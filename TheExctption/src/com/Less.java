package com;

public class Less extends Exception{
    int age;

    public Less(int age) {
        this.age = age;
    }

    @Override
    public String getMessage() {
        System.out.println("小了");
        return super.getMessage();
    }
}

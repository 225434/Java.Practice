package com;

public class Name extends Exception{
    public Name() {
        super();
    }

    @Override
    public String getMessage() {
        System.out.println("空的");
        return super.getMessage();
    }
}

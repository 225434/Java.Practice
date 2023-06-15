package com;

public class FemaleDriver extends Driver{
    public FemaleDriver(String name) {
        super(name);
    }

    void drives() {
        System.out.println(getName()+"(Female) drivers a vehicle.");
    }
}

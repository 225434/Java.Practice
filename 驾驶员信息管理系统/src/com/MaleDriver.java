package com;

public class MaleDriver extends Driver{
    public MaleDriver(String name) {
        super(name);
    }

    void drives()
    {
        System.out.println(getName()+"(male) drivers a vehicle.");
    }
}

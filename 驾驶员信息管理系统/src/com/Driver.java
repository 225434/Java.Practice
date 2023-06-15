package com;

public abstract class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void drives();
}

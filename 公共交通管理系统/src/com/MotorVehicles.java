package com;

public abstract class MotorVehicles {
    private String way;
    private String fare;

    public void setWay(String way) {
        this.way = way;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFare() {
        return fare;
    }

    public String getWay() {
        return way;
    }

    public abstract void brake(String s);
}

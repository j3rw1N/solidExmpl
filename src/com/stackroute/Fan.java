package com.stackroute;

public class Fan implements ElectricAppliance{
    public void on() {
        System.out.println("Fan is rotating");
    }

    public void off() {
        System.out.println("Fan is not rotating");
    }
}

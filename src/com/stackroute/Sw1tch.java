package com.stackroute;

public class Sw1tch {
    private ElectricAppliance appliance;
    private boolean curPosition;

    public Sw1tch(ElectricAppliance appliance) {
        this.appliance = appliance;
    }

    public void toggle() {
        if(curPosition) {
            this.curPosition = false;
            appliance.off();
        }
        else {
            this.curPosition = true;
            appliance.on();
        }
    }
}

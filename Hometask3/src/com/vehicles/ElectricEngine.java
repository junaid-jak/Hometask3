package com.vehicles;

public class ElectricEngine extends Engine {
    private int batteryCapacity;

    public ElectricEngine(int batteryCapacity) {
        this.type = "Electric Engine";
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void engineDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

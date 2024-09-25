package com.vehicles;

public class HybridEngine extends Engine {
    private int combustionHorsepower;
    private int electricBatteryCapacity;

    public HybridEngine(int combustionHorsepower, int electricBatteryCapacity) {
        this.type = "Hybrid Engine";
        this.combustionHorsepower = combustionHorsepower;
        this.electricBatteryCapacity = electricBatteryCapacity;
    }

    @Override
    public void engineDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("Combustion Horsepower: " + combustionHorsepower + " HP");
        System.out.println("Electric Battery Capacity: " + electricBatteryCapacity + " kWh");
    }
}

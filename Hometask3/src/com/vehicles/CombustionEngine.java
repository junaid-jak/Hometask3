package com.vehicles;

public class CombustionEngine extends Engine {
    private int horsepower;

    public CombustionEngine(int horsepower) {
        this.type = "Combustion Engine";
        this.horsepower = horsepower;
    }

    @Override
    public void engineDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower + " HP");
    }
}

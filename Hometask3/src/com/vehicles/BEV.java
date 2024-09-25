package com.vehicles;

public class BEV extends Vehicle {

    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Vehicle Characteristics:");
        manufacture.showDetails();
        engine.engineDetails();
    }
}

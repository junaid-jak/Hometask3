package com.vehicles;

public class Main {

    public static void main(String[] args) {
        // Creating Manufacture and Engine objects
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        
        CombustionEngine iceEngine = new CombustionEngine(250);
        ElectricEngine bevEngine = new ElectricEngine(75);
        HybridEngine hybridEngine = new HybridEngine(150, 50);
        
        // Creating Vehicle objects
        ICEV icev = new ICEV(toyota, iceEngine);
        BEV bev = new BEV(tesla, bevEngine);
        HybridV hybridv = new HybridV(toyota, hybridEngine);

        // Creating an array of vehicles
        Vehicle[] vehicles = {icev, bev, hybridv};

        // Display vehicle characteristics
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println("--------");
        }
    }
}

package org.example;

public abstract class Dacia extends Car {
    public Dacia(int fuelTankSize, String fuelType, int gear, float consumptionPer100km, int tireSize, float availableFuel, String chassisNumber) {
        super(fuelTankSize, fuelType, gear, consumptionPer100km, tireSize, availableFuel, chassisNumber);
    }
}

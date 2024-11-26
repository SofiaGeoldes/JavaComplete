package org.example;

abstract class Car implements Drivable {
   private final int fuelTankSize;
   private final String fuelType;
   private final int gear;
   private final float consumptionPer100km;
   private int tireSize;
   private float availableFuel;
   private String chassisNumber;
   private float currentFuelConsumption;
   private int currentGear;
   private float averageFuelConsumption;


    public Car(int fuelTankSize, String fuelType, int gear, float consumptionPer100km, int tireSize, float availableFuel, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gear = gear;
        this.consumptionPer100km = consumptionPer100km;
        this.averageFuelConsumption = consumptionPer100km;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {
        currentFuelConsumption = 0;
        System.out.println("Start");
    }

    @Override
    public void stop() {
            System.out.println("Stop");

    }

    @Override
    public void drive(float km) {
        currentFuelConsumption = (km * consumptionPer100km)/100;
        availableFuel -= currentFuelConsumption;
    }

    public void shiftGear(int gear){
        if(gear == currentGear){
            return;
        }
        // When accelerating
        if(gear > currentGear) {
            averageFuelConsumption = consumptionPer100km - (10 / 100f * consumptionPer100km);
        }else{ //When decelerating
            averageFuelConsumption = consumptionPer100km + (10 / 100f * consumptionPer100km);
        }
        this.currentGear = gear;

    }

    public float getCurrentFuelConsumption() {
        return currentFuelConsumption;
    }

    public void setCurrentFuelConsumption(float currentFuelConsumption) {
        this.currentFuelConsumption = currentFuelConsumption;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getGear() {
        return gear;
    }

    public float getConsumptionPer100km() {
        return consumptionPer100km;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public String toString() {


        return "Car " +
                ",  availableFuel=" + availableFuel +
                ",  fuelTankSize=" + fuelTankSize +
                ",  fuelType='" + fuelType +
                ",  gear =" + gear +
                ",  consumptionPer100km=" + consumptionPer100km +
                ",  tireSize=" + tireSize +
                ",  chassisNumber " + chassisNumber;
    }
}



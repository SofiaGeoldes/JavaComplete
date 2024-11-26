package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){


        //Car car; // this should not compile.

       // car = new Car();

       // car = new Dacia(27, "xkmjfkm120");

        Car car = new Logan(40, "Petrol", 6, 7.09f, 15, 40, "lahffhh12"); // Logan can extend from Dacia, while Dacia extends from Car

        car.start();

        System.out.println( "Average fuel consumption at the beginning " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getCurrentFuelConsumption());

        car.shiftGear(1);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());

        car.drive(0.01f); // drives 0.01 KMs

        car.shiftGear(2);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());
        car.drive(0.02f);

        car.shiftGear(3);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());
        car.drive(0.5f);

        car.shiftGear(4);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());
        car.drive(0.5f);

        car.shiftGear(4);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());
        car.drive(0.5f);

        car.shiftGear(5);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());

        car.drive(10);

        car.shiftGear(4);

        System.out.println( "Average fuel consumption while driving " + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());
        car.drive(0.5f);

        car.shiftGear(3);

        System.out.println( "Average fuel consumption while slowing down" + car.getAverageFuelConsumption());

        System.out.println( "The available fuel is " + car.getAvailableFuel());

        car.drive(0.1f);

        car.shiftGear(0);

        car.stop();

        double availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println("Average fuel consumption at the end " + fuelConsumedPer100Km);




    }
}

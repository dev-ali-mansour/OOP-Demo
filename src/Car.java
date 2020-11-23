/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Car extends Vehicle {

    Car() {
        super();
    }

    public Car(String color, String model, int productionYear) {
        super(color, model, productionYear);
        System.out.println("Car object created");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Car");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Car");
    }

    public void turnOff(long time) {
        System.out.println("Turn off car at " + time);
    }

    @Override
    public void moveForward() {
        super.turnOn();
        System.out.println("Move car forward");
    }
}

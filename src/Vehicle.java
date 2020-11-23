/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Vehicle {
    private String color;
    private String model;
    protected int productionYear;

    public Vehicle() {
    }

    public Vehicle(String color, String model, int productionYear) {
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void turnOn() {
        System.out.println("Turn on vehicle");
    }

    public void turnOff() {
        System.out.println("Turn off vehicle");
    }

    public void moveForward() {
        System.out.println("Move vehicle forward");
    }

    public void moveBack() {
        System.out.println("Move vehicle back");
    }


}

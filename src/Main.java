import java.util.Scanner;

/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        System.out.println(user.getFirstName());
//        user.setUserName("AliMansour");
//        System.out.println(user.getUserName());

//        Car car = new Car();
//        car.turnOn();
//        car.turnOff();
//        car.moveForward();
//        car.moveBack();

//        Vehicle vehicle = new Vehicle();
//        vehicle.productionYear = 2002;
//        car.productionYear = 2010;


        System.out.print("Please choose your operation: ");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        MathImplementation mathImplementation = new MathImplementation();
        System.out.println("Result: " + mathImplementation.calculate(operation, first, second));
    }
}

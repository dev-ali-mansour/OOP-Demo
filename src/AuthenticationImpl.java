/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class AuthenticationImpl extends Mathematical implements Authentication, Verification {
    @Override
    public boolean login(String userName, String password) {
        return (userName.equalsIgnoreCase("admin") && password.equals("123456"));
    }

    @Override
    public void register(String firstName, String lastName, String userName, String password) {
        System.out.println("User has been registered successfully!");
    }

    @Override
    public void resetPassword(int userId, String newPassword) {
        System.out.println("Your password has been updated!");
    }

    @Override
    public void activateEmail(String email) {
        System.out.println("Your email has been activated!");
    }

    @Override
    public void verifyBySMS(String phoneNumber) {
        System.out.println("Your verification code has been sent to your phone " + phoneNumber);
    }

    @Override
    public void verifyByEmail(String email) {
        System.out.println("Your verification code has been sent to your email:\n " + email);
    }

    @Override
    public int sum(int first, int second) {
        return 0;
    }

    @Override
    public int multiply(int first, int second) {
        return 0;
    }

    @Override
    public int subtract(int first, int second) {
        return 0;
    }

    @Override
    public float divide(int first, int second) {
        return 0;
    }
}

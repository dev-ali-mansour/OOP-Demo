/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class MathImplementation extends Mathematical {

    @Override
    public int sum(int first, int second) {
        return first + second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }

    @Override
    public int subtract(int first, int second) {
        return first - second;
    }

    @Override
    public float divide(int first, int second) {
        return first / second;
    }
}

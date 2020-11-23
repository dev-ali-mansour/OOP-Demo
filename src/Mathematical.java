/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

abstract public class Mathematical {

    public abstract int sum(int first, int second);

    public abstract int multiply(int first, int second);

    public abstract int subtract(int first, int second);

    public abstract float divide(int first, int second);

    public float calculate(char ch, int first, int second) {
        if (ch == '+') return sum(first, second);
        else if (ch == '-') return subtract(first, second);
        else if (ch == '*') return multiply(first, second);
        else if (ch == '/') return divide(first, second);
        else return 0;
    }
}

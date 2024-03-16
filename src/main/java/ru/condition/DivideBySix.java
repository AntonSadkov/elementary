package ru.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 2 == 0) {
            return "This number divided by 6.";
        } else if (number % 3 == 0) {
            return "This number divided by 3, but isn't the even number.";
        } else if (number % 2 == 0) {
            return "This number doesn't divide by 3, but it is the even number.";
        } else {
            return "This number doesn't divide by 3 and it isn't the even number.";
        }
    }
}

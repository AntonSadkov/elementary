package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }
}

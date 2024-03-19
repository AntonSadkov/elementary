package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int count = 0;
        for (int i = number; i >= 1; i--) {
            if (i != 1 && number % i == 0) {
                count++;
            }
        }
        return count == 1;
    }
}

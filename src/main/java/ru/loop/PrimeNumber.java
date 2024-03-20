package ru.loop;

public class PrimeNumber {
    public static int calc(int lastNumber) {
        int result = 0;
        for (int i = 2; i <= lastNumber; i++) {
            if (CheckPrimeNumber.check(i)) {
                result++;
            }
        }
        return result;
    }
}

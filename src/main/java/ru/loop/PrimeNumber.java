package ru.loop;

public class PrimeNumber {
    public static int calc(int lastNumber) {
        int result = 0;
        while (lastNumber != 0) {
            if (CheckPrimeNumber.check(lastNumber)) {
                result++;
            }
            lastNumber--;
        }
        return result;
    }
}

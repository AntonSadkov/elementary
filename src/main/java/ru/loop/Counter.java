package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        return result;
    }

    public static int sumByEven(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += checkEven(i);
        }
        return result;
    }

    private static int checkEven(int num) {
        if (num % 2 == 0) {
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(5, 10));
        System.out.println(sum(10, 15));

        System.out.println(sumByEven(0, 5));
        System.out.println(sumByEven(5, 10));
        System.out.println(sumByEven(10, 15));
    }
}

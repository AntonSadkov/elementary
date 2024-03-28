package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[coins.length + 1];
        int size = 0;
        int change = money - price;

        for (int coin : coins) {
            while (change >= coin) {
                result[size++] = coin;
                change -= coin;
            }
        }

        return Arrays.copyOf(result, size);
    }
}
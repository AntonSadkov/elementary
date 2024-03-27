package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coin = {10, 5, 2, 1};
        int[] result = new int[coin.length + 1];
        int size = 0;
        int change = money - price;

        for (int i = 0; i < coin.length; i++) {
            while (change >= coin[i]) {
                result[size++] = coin[i];
                change -= coin[i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}
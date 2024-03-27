package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coin = {10, 5, 2, 1};
        int[] result = new int[coin.length + 1];
        int size = 0;
        int change = money - price;

        for (int i = 0; i < coin.length; i++) {
            int currentCoin = coin[i];
            while (change >= currentCoin) {
                result[size++] = currentCoin;
                change -= currentCoin;
            }
        }

        return Arrays.copyOf(result, size);
    }
}
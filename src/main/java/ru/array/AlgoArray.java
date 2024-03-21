package ru.array;

import java.util.Arrays;

public class AlgoArray {
    private static int[] arraySort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(arraySort(array)));
    }
}

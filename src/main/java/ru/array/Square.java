package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] num = new int[bound];
        for (int i = 0; i < bound; i++) {
            num[i] = i * i;
        }
        return num;
    }

    public static void main(String[] args) {
        for (int result : calculate(4)) {
            System.out.println(result);
        }
    }
}

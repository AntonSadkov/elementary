package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int maxValue = max(first, second);
        return max(maxValue, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxValue = max(first, second, third);
        return max(maxValue, fourth);
    }

    public static void main(String[] args) {
        System.out.println(max(3, 2));
        System.out.println(max(2, 3));
        System.out.println(max(2, 2));
        System.out.println(max(2, 2, 2));
        System.out.println(max(2, 2, 3));
        System.out.println(max(2, 2, 2, 2));
        System.out.println(max(2, 2, 2, 3));
    }
}

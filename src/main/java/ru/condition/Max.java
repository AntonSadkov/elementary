package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 2));
        System.out.println(max(2, 3));
        System.out.println(max(2, 2));
    }
}

package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
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

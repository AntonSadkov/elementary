package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(result);
    }

    public static void main(String[] args) {
        double result = distance(1, 2, 3, 2);
        System.out.printf("Result (1, 2) to (2, 0) %.4f", result);
    }
}

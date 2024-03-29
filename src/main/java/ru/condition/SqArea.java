package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;

        return length * height;
    }

    public static void main(String[] args) {
        System.out.println("p = 6, k = 2, s = " + square(6, 2));
    }
}

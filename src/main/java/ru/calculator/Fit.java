package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 184;
        System.out.println(manWeight(manHeight));

        short womanHeight = 168;
        System.out.println(womanWeight(womanHeight));
    }
}

package ru.converter;

public class Converter {

    public static float rubToEur(float rub) {
        return rub / 100;
    }

    public static float rubToUsd(float rub) {
        return rub / 90;
    }

    public static void main(String[] args) {
        float euro = rubToEur(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float usd = rubToUsd(123);
        System.out.println("123 rubles are " + usd + " dollars.");
    }
}

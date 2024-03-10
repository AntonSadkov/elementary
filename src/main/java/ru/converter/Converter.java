package ru.converter;

public class Converter {

    public static float rubToEur(float rub) {
        return rub / 100;
    }

    public static float rubToUsd(float rub) {
        return rub / 90;
    }

    public static void main(String[] args) {
        boolean passed;

        float euro = rubToEur(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float expected = 1.4f;
        passed = expected == euro;
        System.out.println("140 rubles are 1.4 euro. Test result: " + passed);

        float usd = rubToUsd(123);
        System.out.println("123 rubles are " + usd + " dollars.");

        expected = 1.3666667f;
        passed = expected == usd;
        System.out.println("123 rubles are 1.3666667 dollars. Test result: " + passed);
    }
}

package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double resultAmountSubtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double resultAmountAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.printf("Результат расчёта равен: %.1f", sumAndMultiply(10, 20));
        System.out.printf("\nРезультат расчёта равен: %.1f", resultAmountSubtractionAndDivision(5, 10));
        System.out.printf("\nРезультат расчёта равен: %.1f", resultAmountAllOperations(7, 7));
    }
}

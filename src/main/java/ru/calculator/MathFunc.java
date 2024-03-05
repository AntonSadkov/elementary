package ru.calculator;
//1.7 Результат работы метода.
public class MathFunc {
    public static void main(String[] args) {
        int result1 = func1(3);
        float result2 = func2(5F);
        float total = result1 + result2;
        System.out.println(total);

        int result3 = func1(100);
        System.out.println(result3);
    }

    public static int func1(int x) {
        return x * x + 1;
    }

    public static float func2(float x) {
        return 1 / x;
    }
}

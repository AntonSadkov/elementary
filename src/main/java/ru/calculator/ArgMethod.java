package ru.calculator;
//1.6 Аргументы.

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Java";
        int age = 6;

        hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.printf("Hello %s, age = %d;", name, age);
    }
}

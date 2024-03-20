package ru.array;

public class ArrayDefinition {
    private static void printName() {
        String[] names = new String[4];
        names[0] = "Anton";
        names[1] = "Anna";
        names[2] = "Misha";
        names[3] = "Leonid";

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);

        String[] surnames = new String[100500];
        System.out.println(surnames.length);

        float[] prices = new float[40];
        System.out.println(prices.length);

        printName();
    }
}

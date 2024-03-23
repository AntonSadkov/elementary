package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean referenceValue = data[0];
        for (boolean value : data) {
            if (value != referenceValue) {
                return false;
            }
        }
        return true;
    }
}

package ru.condition;

public class TreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        } else if (third >= first) {
            result = third;
        }
        return result;
    }
}

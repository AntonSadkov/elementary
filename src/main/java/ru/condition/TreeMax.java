package ru.condition;

public class TreeMax {
    public static int max(int first, int second, int third) {
        if (first >= second && first > third) {
            return first;
        } else if (second > first && second >= third) {
            return second;
        } else if (third > first) {
            return third;
        } else {
            return first;
        }
    }
}

package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second > first && second >= third) {
            return second;
        } else {
            return third;
        }
    }

    public static int max(int first, int second, int third, int fourth) {
        if (first >= second && first >= third && first >= fourth) {
            return first;
        } else if (second > first && second >= third && second >= fourth) {
            return second;
        } else if (third > first && third > second && third >= fourth) {
            return third;
        } else {
            return fourth;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(3, 2));
        System.out.println(max(2, 3));
        System.out.println(max(2, 2));
        System.out.println(max(2, 2, 2));
        System.out.println(max(2, 2, 3));
        System.out.println(max(2, 2, 2, 2));
        System.out.println(max(2, 2, 2, 3));
    }
}

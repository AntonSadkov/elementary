package ru.loop;

public class Fitness {
    public static int calc(int pullWeightOne, int pullWeightTwo) {
        int month = 0;
        while (pullWeightOne <= pullWeightTwo) {
            pullWeightOne *= 3;
            pullWeightTwo *= 2;

            month++;
        }
        return month;
    }
}

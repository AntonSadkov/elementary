package ru.loop;

public class Mortgage {
    public static int calculatingLoanTerm(double amount, double salary, double percent) {
        int year = 0;
        percent /= 100;

        while (amount > 0) {
            amount += amount * percent - salary;
            year++;
        }
        return year;
    }
}

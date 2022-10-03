package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
        for (int index = n; index > 0; index--) {
            factorial = factorial * index;
        }
        return factorial;
    }
}
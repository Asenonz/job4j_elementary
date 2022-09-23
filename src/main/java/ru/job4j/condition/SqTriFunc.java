package ru.job4j.condition;

public class SqTriFunc {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1, b = 1, c = 1, x = 1;
        int rsl = SqTriFunc.calc(a, b, c, x);
        System.out.println(rsl);
    }
}

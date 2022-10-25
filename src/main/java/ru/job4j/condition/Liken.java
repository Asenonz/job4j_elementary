package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        System.out.println(firstMoreSecond(first, second));
        System.out.println(firstLessSecond(first, second));
        System.out.println(firstEqualsSecond(first, second));
    }

    public static boolean firstMoreSecond(int first, int second) {
        return first > second;
    }

    public static boolean firstLessSecond(int first, int second) {
        return first < second;
    }

    public static boolean firstEqualsSecond(int first, int second) {
        return first == second;
    }

}
package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;

    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second) >= max(third, fourth) ? max(first, second) : max(third, fourth);
    }

    public static void main(String[] args) {
        System.out.println(max(8, 3, 10, 2));
        System.out.println(max(10, 3, 9, 2));
        System.out.println(max(1, 2));
    }
}

package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if ((number % 3) == 0  && (number % 2) == 0) {
            rsl = "Number is divisible by 6.";
        } else if ((number % 3) == 0 && ((number % 2) != 0)) {
            rsl = "The number is divisible by 6 but is odd.";
        } else if (((number % 3) != 0) && ((number % 2) == 0)) {
            rsl = "Number is not divisible by 3 but is even.";
        } else {
            rsl = "Number is not divisible by 3 and is not even.";
        }
        return rsl;
    }
}
package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in1 = 140, in2 = 150;
        float expected1 = 2, expected2 = 2.5f;
        float out1 = Converter.rubleToEuro(in1);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed1);
        System.out.println("150 rubles are " + dollar + " dollars. Test result: " + passed2);
    }
}
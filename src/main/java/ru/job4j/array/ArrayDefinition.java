package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива = " + ages.length);
        System.out.println("Размер массива = " + surnames.length);
        System.out.println("Размер массива = " + prices.length);
        String[] names = new String[4];
        names[0] = "Georgy";
        names[1] = "Anna";
        names[2] = "Alexander";
        names[3] = "Ivan";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}



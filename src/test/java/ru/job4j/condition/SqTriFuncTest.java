package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqTriFuncTest {
    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1, b = 1, c = 1, x = 1;
        int expected = 3;
        int rsl = SqTriFunc.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0, b = 1, c = 1, x = 1;
        int expected = 2;
        int rsl = SqTriFunc.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1, b = 1, c = 0, x = 1;
        int expected = 2;
        int rsl = SqTriFunc.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C01X0Then1() {
        int a = 1, b = 1, c = 0, x = 1;
        int expected = 2;
        int rsl = SqTriFunc.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

}
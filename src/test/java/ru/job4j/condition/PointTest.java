package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to05then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when99to96then3() {
        double expected = 3;
        Point a = new Point(9, 9);
        Point b = new Point(9, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
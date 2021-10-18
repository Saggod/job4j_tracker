package ru.job4j.tracker.oop;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 2);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20then2() {
        double expected = 2;
        Point first = new Point(1, 2);
        Point second = new Point(1, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00then0() {
        double expected = 0;
        Point first = new Point(2, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to11then2() {
        double expected = 2;
        Point first = new Point(3, 1);
        Point second = new Point(5, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when020to035then6() {
        double expected = 5;
        Point first = new Point(0, 2, 0);
        Point second = new Point(0, 3, 5);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 1);
    }

}
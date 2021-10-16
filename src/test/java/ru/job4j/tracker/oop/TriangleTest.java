package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void areaNotExist() {
        double expected = -1;
        Point ab = new Point(9, 0);
        Point bc = new Point(3, 0);
        Point ac = new Point(5, 0);
        Triangle triangle = new Triangle(ab, bc, ac);
        double result = triangle.area();
        assertEquals(result, expected, 0.001);

    }
}
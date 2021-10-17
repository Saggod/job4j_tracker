package ru.job4j.tracker.oop;


import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MaxTest  {

    @Test
    public void whenMax1To2To3Then3() {
        double first = 1;
        double second = 2;
        double third = 3;
        double result = Max.max(first, second, third);
        double expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax1To5To6To7Then7() {
        double first = 1;
        double second = 5;
        double third = 6;
        double fourthly = 7;
        double result = Max.max(first, second, third, fourthly);
        double expected = 7;
        assertEquals(result, expected);

    }
}
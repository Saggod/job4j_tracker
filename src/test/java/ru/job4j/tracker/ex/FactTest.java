package ru.job4j.tracker.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = StackOverflowError.class)
    public void whenLessThanZero() {
        Fact.calc(-5);
    }
}
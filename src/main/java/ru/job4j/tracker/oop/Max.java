package ru.job4j.tracker.oop;

public class Max {

    public static double max(double first, double second) {
        double result = first >= second ? first : second;
        return result;
    }

    public static double max(double first, double second, double third) {
        return max(
                first,
                max(second, third)
        );
    }

    public static double max(double first, double second, double third, double fourthly) {
        return max(
                second,
                max(third, fourthly)
        );
    }
}

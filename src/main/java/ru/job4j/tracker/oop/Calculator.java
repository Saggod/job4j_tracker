package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rslMinus = minus(3);
        System.out.println("rslMinus = " + rslMinus);
        int rslDivide = calculator.divide(10);
        System.out.println("rslDivide = " + rslDivide);
        int rslSummAll = calculator.sumAllOperation(5);
        System.out.println("rslSummAll = " + rslSummAll);
    }
}

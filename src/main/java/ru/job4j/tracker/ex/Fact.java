package ru.job4j.tracker.ex;

public class Fact {

        public static int calc(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
                return calc(n - 1) * n;
        }

        public static void main(String[] args) {
            int rsl = calc(1);
            System.out.println(rsl);
        }
}

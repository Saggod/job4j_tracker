package ru.job4j.tracker.poly;

public interface Transport {
    void move();

    void count(int passengers);

    int charge(int fuel);
}

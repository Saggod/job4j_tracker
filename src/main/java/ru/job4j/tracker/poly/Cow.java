package ru.job4j.tracker.poly;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
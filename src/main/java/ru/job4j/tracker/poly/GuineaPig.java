package ru.job4j.tracker.poly;

public class GuineaPig implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
    }
}
package ru.job4j.tracker.poly;

public class Bus implements Vehicle {
    @Override
    public void numberVehicle() {
        System.out.print(getClass().getSimpleName() + " A 123 AA");
    }

    @Override
    public void move() {
        System.out.println(" Движется по скоростной трассе");
    }
}

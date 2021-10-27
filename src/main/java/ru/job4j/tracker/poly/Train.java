package ru.job4j.tracker.poly;

public class Train implements Vehicle {
    @Override
    public void numberVehicle() {
        System.out.print(getClass().getSimpleName() + " Train 123");
    }

    @Override
    public void move() {
        System.out.println(" Движется по рельсам.");
    }
}

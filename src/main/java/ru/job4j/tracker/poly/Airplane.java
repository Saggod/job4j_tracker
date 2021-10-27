package ru.job4j.tracker.poly;

public class Airplane implements Vehicle {

    @Override
    public void numberVehicle() {
        System.out.print(getClass().getSimpleName() + " P-9 ");
    }

    @Override
    public void move() {
        System.out.println(" Летит по воздуху");
    }

}

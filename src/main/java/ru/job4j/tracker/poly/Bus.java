package ru.job4j.tracker.poly;

public class Bus implements Vehicle, Transport {
    @Override
    public void numberVehicle() {
        System.out.print(getClass().getSimpleName() + " A 123 AA");
    }

    @Override
    public void move() {
        System.out.println(" Движется по скоростной трассе");
    }

    @Override
    public void count(int passengers) {
        System.out.println("Максимум пвссажиров = " + passengers);

    }

    @Override
    public int charge(int fuel) {
        return fuel * 5;
    }
}

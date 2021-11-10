package ru.job4j.tracker.ooa;

public class Airport {

    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCounstEngine();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCounstEngine();

        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCounstEngine();
    }
}

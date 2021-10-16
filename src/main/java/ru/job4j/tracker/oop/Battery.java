package ru.job4j.tracker.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(9);
        Battery wasted = new Battery(2);
        battery.exchange(wasted);
        System.out.println("battery: " + battery.load + ". wasted: " + wasted.load);
    }

}

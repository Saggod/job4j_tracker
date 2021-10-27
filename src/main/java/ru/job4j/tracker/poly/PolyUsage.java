package ru.job4j.tracker.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {bus, airplane, train};
        for (Vehicle v : vehicles) {
            v.numberVehicle();
            v.move();
        }

        Animal[] animals = new Animal[]{cow, goose, dog, guineaPig};
        for (Animal a : animals) {
            a.sound();
        }
    }
}

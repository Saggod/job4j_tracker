package ru.job4j.tracker.clinic;

public class Pacient extends Diagnosis {

    private String direction;

    public Pacient(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

package ru.job4j.tracker.clinic;

public class Doctor extends Profession {

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnosis heal(Pacient pacient) {
        heal(pacient);
        return null;
    }

}

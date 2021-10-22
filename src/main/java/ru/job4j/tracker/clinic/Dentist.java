package ru.job4j.tracker.clinic;

public class Dentist extends Doctor {

    private String thoothNumber;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getThoothNumber() {
        return thoothNumber;
    }

}

package ru.job4j.tracker.Clinic;

public class Diagnosis extends Doctor {
    private String diagnos;

    public Diagnosis(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }


    public String getDiagnos() {
        return diagnos;
    }


}

package ru.job4j.tracker.clinic;

public class Surgeon extends Doctor {

    private String whatNeedToOperation;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getWhatNeedToOperation() {
        return whatNeedToOperation;
    }

}

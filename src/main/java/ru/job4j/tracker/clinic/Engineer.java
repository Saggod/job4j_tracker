package ru.job4j.tracker.clinic;

public class Engineer extends Profession {

    private String whatEngeneer;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getWhatEngeneer() {
        return whatEngeneer;
    }

}

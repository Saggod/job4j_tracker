package ru.job4j.tracker.clinic;

public class Builder extends Engineer {

    private String whatBuild;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getWhatBuild() {
        return whatBuild;
    }
}

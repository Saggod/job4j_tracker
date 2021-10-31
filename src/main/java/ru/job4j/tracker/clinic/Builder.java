package ru.job4j.tracker.clinic;

public class Builder extends Engineer {

    private String buildTown;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.buildTown = buildTown;
    }

    public String getBuildTown() {
        return buildTown;
    }
}

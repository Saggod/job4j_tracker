package ru.job4j.tracker.clinic;

public class Programmer extends Engineer {

    private String progLang;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.progLang = progLang;
    }

    public String getProgLang() {
        return progLang;
    }

}

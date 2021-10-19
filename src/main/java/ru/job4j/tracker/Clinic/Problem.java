package ru.job4j.tracker.Clinic;

public class Problem extends Engineer {
    private String problem;

    public Problem(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getProblem() {
        return problem;
    }

}

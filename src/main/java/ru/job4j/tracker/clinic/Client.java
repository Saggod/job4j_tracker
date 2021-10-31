package ru.job4j.tracker.clinic;

public class Client extends Profession {

    private String clientProblem;

    public Client(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.clientProblem = clientProblem;
    }

    public String getClientProblem() {
        return clientProblem;
    }
}

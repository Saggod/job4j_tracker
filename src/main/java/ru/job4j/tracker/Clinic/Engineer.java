package ru.job4j.tracker.Clinic;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Problem repair (Client client) {
        repair(client);
        return null;
    }

}

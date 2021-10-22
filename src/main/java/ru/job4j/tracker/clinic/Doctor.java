package ru.job4j.tracker.clinic;

public class Doctor extends Profession {

    private String doctorSpetsialization;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Doctor() {
        super();
    }

    Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }

    public String getDoctorSpetsialization() {
        return doctorSpetsialization;
    }

}

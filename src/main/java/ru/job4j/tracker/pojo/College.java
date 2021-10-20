package ru.job4j.tracker.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aleksei Zhabura");
        student.setGroup("1");
        student.setAdmission(new Date());

        System.out.println("Студент: " + student.getName() + ". " + System.lineSeparator()
                + "Группа: " + student.getGroup() + ". " + System.lineSeparator()
                + "Дата поступления: " + student.getAdmission() + ".");
    }
}

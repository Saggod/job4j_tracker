package ru.job4j.tracker.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Petr");
        name.add("Ivan");
        name.add("Stepan");
        for (String value : name) {
            System.out.println(value);
        }
    }
}

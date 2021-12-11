package ru.job4j.tracker.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person val : persons) {
            if (val.getName().contains(key)
                    || val.getSurname().contains(key)
                    || val.getPhone().contains(key)
                    || val.getAddress().contains(key)) {
                result.add(val);
                System.out.println("Method find object: " + persons.toString());
            } else {
                System.out.println("Method not found find object");
            }
        }
        return result;
    }
}

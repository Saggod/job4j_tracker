package ru.job4j.tracker.pojo;

public class Book {
    private String name;
    private int countPage;

    public Book(String name, int countPage) {
        this.name = name;
        this.countPage = countPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return countPage;
    }

    public void setCount(int countPage) {
        this.countPage = countPage;
    }
}

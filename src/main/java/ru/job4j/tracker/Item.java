package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item(){
    }

    public Item(int id){
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item (LocalDateTime created) {
        this.created = created;
    }

    public void print() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.print();
        Item second = new Item(1);
        second.print();
        Item thrid = new Item(2, "I'm constructor");
        thrid.print();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}

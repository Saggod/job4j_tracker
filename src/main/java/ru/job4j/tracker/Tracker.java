package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] findName = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            boolean eq = name.getName().equals(key);
            if (eq) {
                findName[i] = name;
                count++;
            }
        }
        findName = Arrays.copyOf(findName, count);
        return findName;
    }

    public Item[] findAll() {
        Item[] nameWithounNull = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name != null) {
                nameWithounNull[count] = name;
                count++;
            }
        }
        nameWithounNull = Arrays.copyOf(nameWithounNull, count);
        return nameWithounNull;
    }
}


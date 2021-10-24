package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private int oldID;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            boolean eq = name.getName().equals(key);
            if (eq) {
                rsl[i] = name;
                count++;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        oldID = id;
        boolean rsl = indexOf(id) > -1;
        if (rsl) {
            items[indexOf(id)].setName(item.getName());
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = indexOf(id) > -1;
        for (int index = 0; index < items.length; index++) {
            int length = size - index - 1;
            int start = index + 1;
            if (indexOf(id) == index && rsl) {
                items[indexOf(id)] = null;
                System.arraycopy(items, start, items, index, length);
                items[size - 1] = null;
                size--;
            }
        }
        return false;
    }
}
package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) { //добавление заявок
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) { //получение заявки по id
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

//    public Item[] findByName(String key) { //получение списка по имени
//
//    }
//
//
//    public Item[] findAll() { //получение списка всех заявок
//
//    }

}

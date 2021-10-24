package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime oldFormat = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTime = oldFormat.format(formatter);

        System.out.println("Current date = " + currentDateTime);

        System.out.println(item);
    }
}

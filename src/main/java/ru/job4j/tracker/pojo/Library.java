package ru.job4j.tracker.pojo;

public class Library {

    public static void main(String[] args) {
        Book fantasy = new Book("Lord of the rings", 400);
        Book algoritm = new Book("Algorithms and Data Structures", 350);
        Book cookie = new Book("Good food", 50);
        Book programmers = new Book("Java", 300);
        Book[] books = new Book[4];
        books[0] = fantasy;
        books[1] = cookie;
        books[2] = algoritm;
        books[3] = programmers;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        Book code = new Book("Clean code", 400);
        books[0] = code;
        for (Book bk : books) {
            if (("Clean code").equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}

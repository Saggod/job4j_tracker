package ru.job4j.tracker;

public final class SingleTracker {

    private static SingleTracker instans = null;

    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstans() {
        if (instans == null) {
            instans = new SingleTracker();
        }
        return instans;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item findByName(String key) {
        return null;
    }

    public Item findAll() {
        return null;
    }

    public Item indexOf(int id) {
        return null;
    }

    public Item replace(int id, Item item) {
        return null;
    }

    public Item delete(int id) {
        return null;
    }

}

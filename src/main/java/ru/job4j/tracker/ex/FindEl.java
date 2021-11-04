package ru.job4j.tracker.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        if (key == null) {
            throw new ElementNotFoundException("key cannot be null");
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                System.out.println("index = " + i);
            }
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"test", "cat", "dog", "bird"};
        try {
            indexOf(value, "cat");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

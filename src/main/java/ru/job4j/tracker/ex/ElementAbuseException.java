package ru.job4j.tracker.ex;

public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String message) {
        super(message);
    }
}

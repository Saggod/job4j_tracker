package ru.job4j.tracker.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public static void main(String[] args) {
        Error error = new Error(true, 500, "Ошибка ответа от сервера");
        error.print();
        Error error1 = new Error();
        error1.print();
    }

    public void print () {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }


}

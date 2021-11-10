package ru.job4j.tracker.ooa;

public class Airbus {
    final private static int COUNT_ENGINE = 2;
    private static int count_engine_a380 = 4;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCounstEngine() {
        if (!name.equals("A380")) {
            System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
        } else {
            System.out.println("Количество двигателей равно: " + count_engine_a380);
        }
    }


    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}

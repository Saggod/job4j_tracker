package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng){
        String unknown = "Неизвестное слово. " + eng;
        return unknown;
    }

    public static void main(String[] args) {
        DummyDic engl = new DummyDic();
        String say = engl.engToRus("Hello.");
        System.out.println(say);
    }

}

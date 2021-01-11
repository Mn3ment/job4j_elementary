package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            // case
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Monday"));
    }
}

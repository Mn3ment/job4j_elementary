package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int num) {
        if ((num % 5 == 0) && (num % 3 == 0)) {
            return ("Hello, World!!!");
        } else if (num % 5 == 0) {
            return ("World");
        } else if (num % 3 == 0) {
            return ("Hello");
        }
        return ("Operation not support");
    }
}

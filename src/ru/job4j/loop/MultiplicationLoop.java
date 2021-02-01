package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 0;
        while (a <= b) {
            rsl = a * b;
            a++;
        }
        return rsl;
    }
}
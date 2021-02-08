package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left > right;
        return max ? left : right;
    }

    public static int max(int first, int second, int third) {
        int rsl = max(first, max(second, third));
        return rsl;
    }

    public static int max(int first, int second, int third, int forth) {
        int rsl = max(max(first, second), max(third, forth));
        return rsl;
    }
}

package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean max = left > right;
        return max ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(154, 86);
        System.out.println(rsl);
    }
}

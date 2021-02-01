package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        rsl1 = Math.pow(rsl1, 2);
        rsl2 = Math.pow(rsl2, 2);
        double rsl = rsl1 + rsl2;
        rsl = Math.sqrt(rsl);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(10, 5, 2, 20);
        System.out.println("result (10, 5) to (2, 20) " + result);
    }
}

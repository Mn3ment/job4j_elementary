package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = first;
        if ((first >= second) && (first >= third)) {
            rsl = first;
        }
        else if ((second >= first) && (second >= third)) {
                rsl = second;
            }
        else {
            rsl = third;
        }
        return rsl;
    }
}

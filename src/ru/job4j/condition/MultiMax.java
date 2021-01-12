package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = third;
        if ((first < second) && (first < third)) {
            if ((second >= third)) {
                    rsl = second;
                }
        } else {
            rsl = first;
            }
        return rsl;
    }
}

package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if ((first < second) || (first < third)) {
            if (second > first && second > third) {
                result = second;
            }
        } else {
            result = first;
        }
        return result;
    }
}


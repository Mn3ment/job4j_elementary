package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i < left.length && j < right.length) {
                rsl[index] = left[i] > right[j] ? right[j++] : left[i++];
            } else if (j < right.length) {
                rsl[index] = right[j++];
            } else {
                rsl[index] = left[i++];
            }
        }
        return rsl;
    }
}

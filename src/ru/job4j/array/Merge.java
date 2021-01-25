package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            index++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[index] = right[j];
            index++;
        }
        for (int k = 0; k < rsl.length; k++) {
            for (int l = rsl.length - 1; l > k; l--) {
                if (rsl[l - 1] > rsl[l]) {
                    int tmp = rsl[l - 1];
                    rsl[l - 1] = rsl[l];
                    rsl[l] = tmp;
                }
            }
        }
        return rsl;
    }
}

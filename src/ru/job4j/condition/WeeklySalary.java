package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int prize = 0;
        int weekend = 0;
        int count = 10;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5 && hours[i] <= 8) {
                prize = count * hours[i] + weekend;
                weekend = prize;
            } else if (i < 5 && hours[i] > 8) {
                prize = (count * 8) + ((count + 5) * (hours[i] - 8)) + weekend;
                weekend = prize;
            }
            if (i > 4 && hours[i] <= 8) {
                prize = (count * 2) * hours[i] + weekend;
                weekend = prize;
            } else if (i > 4 && hours[i] > 8) {
                prize = (count * 8 * 2) + ((count * 3) * (hours[i] - 8)) + weekend;
                weekend = prize;
            }
        }
        return weekend;
    }
}

package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height1) {
        return (height1 - 100) * 1.15;
    }
    public static double womanWeight(short height2) {
        return (height2 - 110) * 1.15;
    }
    public static void main(String[] args) {
        short height1 = 182;
        short height2 = 174;
        double man = Fit.manWeight(height1);
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 182 is " + man);
        System.out.println("Woman 174 is " + woman);
    }
}

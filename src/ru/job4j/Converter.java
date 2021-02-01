package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        int inEuro = 140;
        int inDollar = 240;
        int expectedEuro = 2;
        int expectedDollar = 4;
        int outEuro = Converter.rubleToEuro(inEuro);
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("240 rubles are 4. Test result : " + passedDollar);
    }
}

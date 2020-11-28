package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return num % 2 != 0;
    }

    public boolean notPositive(int num) {
        if (!(num > 0))
            return !isEven(num);
        return false;
    }

    public boolean notEvenAndPositive(int num) {
        return ((num % 2 != 0) && (num>0));
    }

    public boolean evenOrNotPositive(int num) {
        return ((num % 2 == 0) || !(num > 0));
    }
}

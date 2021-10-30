package com.company.task2;

public class Task2 {

    public static void main(String[] args) {
        double x = 0.5;
        double y = 3.5;
        System.out.println(isPointBelongs(x, y));
    }

    public static boolean isPointBelongs(double x, double y) {
        if (y > 0) {
            return (y <= 5) && (x >= -4) && (x <= 4);
        } else {
            return (y >= -3) && (x >= -6) && (x <= 6);
        }
    }
}

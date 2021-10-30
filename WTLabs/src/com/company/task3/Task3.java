package com.company.task3;

public class Task3 {

    public static void main(String[] args) {
        double a = -6.28;
        double b = 6.28;
        double h = 0.01;
        System.out.println(calculate(a, b, h));
    }

    public static String calculate(double a, double b, double h) {
        String result = "";
        for (double x = a; x <= b; x += h) {
            result += x + " " + Math.tan(x) + "\n";
        }
        return result;
    }
}

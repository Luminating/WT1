package com.company.task1;

public class Task1 {

    public static void main(String[] args) {
        double var1 = 1.5;
        double var2 = 3.5;
        System.out.println(calculate(var1, var2));
    }

    public static double calculate(double x, double y) {
        return (1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)))) + x;
    }
}

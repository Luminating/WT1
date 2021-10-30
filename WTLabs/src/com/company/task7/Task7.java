package com.company.task7;

public class Task7 {
    public static void main(String[] args) {
        double[] array = {3, 6, -1, 3, 9, 10, 5, -5, 7, -2, -4};
        array = shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static double[] shellSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i >= 1) {
                    i -= 2;
                }
            }
        }
        return array;
    }
}

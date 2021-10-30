package com.company.task4;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isPrimalPresent(array));
    }

    public static boolean isPrimal(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static String isPrimalPresent(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (isPrimal(array[i])) result += i + " ";
        }
        return result;
    }
}

package com.company.task6;

public class Task6 {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        printMatrix(calcMatrix(array));
    }

    public static double[][] calcMatrix(double[] array){
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[nextIndex(j + i, array.length)];
            }
        }
        return matrix;
    }

    public static int nextIndex(int index, int length){
        if ((index) >= length) {
            return index - length;
        } else {
            return index;
        }
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

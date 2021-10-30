package com.company.task5;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {14, 4, 6, 8,32,31,11,9,45,16,3,2,12,80};
        printIncreasingSequence(array, calcIncreasingSequence(array));
    }

    public static ArrayList<Integer> calcIncreasingSequence(int[] array){
        ArrayList<Integer> maxSequence = new ArrayList<Integer>();
        ArrayList<Integer> currSequence = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            currSequence.add(i);
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[currSequence.get(currSequence.size() - 1)]) {
                    currSequence.add(j);
                }
            }
            if (currSequence.size() > maxSequence.size()) {
                maxSequence = new ArrayList<Integer>(currSequence);
            }
            currSequence.clear();
        }
        return maxSequence;
    }

    public static void printIncreasingSequence(int[] array, ArrayList<Integer> maxSequence){
        System.out.println(array.length - maxSequence.size());
        for (int index : maxSequence){
            System.out.print(array[index] + " ");
        }
    }
}

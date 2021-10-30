package com.company.task8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        double[] firstSeq = {1, 3, 5, 6, 6, 8, 10, 15, 16, 16};
        double[] secondSeq = {1, 4, 5, 8, 8, 11, 12, 14, 15, 17, 18};
        System.out.println(calcInsertIndexes(firstSeq, secondSeq));
    }

    public static ArrayList<Integer> calcInsertIndexes(double[] firstSeq, double[] secondSeq){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < firstSeq.length - 1; i++) {
            if ((secondSeq[j] >= firstSeq[i]) && (secondSeq[j] < firstSeq[i + 1])) {
                result.add(i);
                while (secondSeq[j] < firstSeq[i + 1]) {
                    j++;
                }
            }
        }
        if (j < secondSeq.length) {
            result.add(firstSeq.length - 1);
        }
        return result;
    }
}

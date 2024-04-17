package com.hiru.dsa.java.ROUGHWORK.TwoPointers;

import java.util.Arrays;

public class MoveAllScatterredZerosToEnd {
    public static void main(String args[]) {
        int[] arr = {1, 0, 0, 2, 3, 4, 0, 5, 0};
        // {1, 0, 0, 2, 0,3,4,5} == DONT swap 0 with 5 (Array shift from i1 to i2 to percolate 0 Down)

        System.out.println(Arrays.toString(arr));
        moveZeros(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Learnings: Pay attension to indexes and i1 i2 pointer advances
     * DONT use pointer conditions in && || clause
     * keep clean implementation with """ if (if-else) else (if-else) """ for 2 variable binary conditions
     */
    public static void moveZeros(int[] arr, int size) {
        if (size == 0 || size == 1)
            return;

        int i1 = 0; //Slow
        int i2 = 1; //Fast

        while (i2 < size) {
            if (arr[i1] == 0) {
                if (arr[i2] == 0) {
                    i2++; // Dont disturb i1 which is meant to be replaced by i2 in future
                } else {
                    arr[i1] = arr[i2];
                    arr[i2] = 0;
                    i1++;
                    i2++;
                }
            } else {
                if (arr[i2] == 0) {
                    i1++;
                } else {
                    i1++;
                    i2++;
                }
            }
        }
    }
}

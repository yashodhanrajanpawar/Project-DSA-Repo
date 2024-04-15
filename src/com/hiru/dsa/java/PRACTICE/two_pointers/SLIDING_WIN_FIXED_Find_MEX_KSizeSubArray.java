package com.hiru.dsa.java.PRACTICE.two_pointers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * GFG: https://www.geeksforgeeks.org/maximum-mex-from-all-subarrays-of-length-k/
 * Given an array arr[] consisting of N distinct integers and an integer K,
 * the task is to find the maximum MEX from all subarrays of length K.
 *
 * The MEX is the smallest positive (NON-zero) integer that is not present in the array.
 *
 *
 * Input: arr[] = {3, 2, 1, 4}, K = 2
 * Output: 3
 * Explanation:
 * All subarrays having length 2 are {3, 2}, {2, 1}, {1, 4}.
 * In subarray {3, 2}, the smallest positive integer which is not present is 1.
 * In subarray {2, 1}, the smallest positive integer which is not present is 3.
 * In subarray {1, 4}, the smallest positive integer which is not present is 2.
 *
 * Input: arr[] = {6, 1, 3, 2, 4}, K = 3
 * Output: 4
 * Explanation:
 * All subarrays having length 3 are {6, 1, 3}, {1, 3, 2}, {3, 2, 4}
 * In subarray {6, 1, 3}, the smallest positive integer which is not present is 2.
 * In subarray {1, 3, 2}, the smallest positive integer which is not present is 4.
 * In subarray {3, 2, 4}, the smallest positive integer which is not present is 1.
 */
public class SLIDING_WIN_FIXED_Find_MEX_KSizeSubArray {

    //===============================================================
    public static void main(String args[]) {
        int arr[] = new int[]{6, 1, 5, 2, 1};
        int K = 3;
        printMEX(arr, arr.length, K);

    }

    //===============================================================
    public static void printMEX(int[] arr, int size, int k) {
        System.out.println("Array: " + Arrays.toString(arr));

        //======= Init State (First window)
        int start = 0, end = 0;
        TreeSet<Integer> window = new TreeSet<>(); // Sorted values
        for (end = start; end < start + k; end++) {
            window.add(arr[end]);
        }
        System.out.println("MEM: " + getNextMinInt(window, k));
        //====== Next Windows till end reaches size
        start++; // End is alreay pointeed to next sliding window
        while (end < size) {
            // Update window
            window.remove(arr[start - 1]);
            window.add(arr[end]);
            System.out.println("MEM: " + getNextMinInt(window, k));
            start++;
            end++;
        }
    }

    private static int getNextMinInt(TreeSet<Integer> window, int k) {
        int min = window.first();
        int max = window.last();
        int output;
        //System.out.println(min + "," + max);
        if (k == 1) {
            output = min > 1 ? 1 : 2;
        } else {
            if (min > 1) {
                output = 1;
            } else {
                // min==1
                if (max - min == k - 1) {
                    output = max + 1;
                } else {
                    Iterator<Integer> iter = window.iterator();
                    int a1 = iter.next();
                    int a2 = 0;
                    while (iter.hasNext()) {
                        a2 = iter.next();
                        if (a2 - a1 > 1)
                            return a1 + 1;
                        else
                            a1 = a2;
                    }
                    output = a2 + 1;
                }
            }
        }
        return output;
    }
}


/**
 * Rough Work
 * min, max
 * case2 == If min == 1 && max-min == k ------- max+1
 * case4 ( 1 ,6, 8) == If min== 1 && max-min > K -------- Find the non existing in K size window
 */

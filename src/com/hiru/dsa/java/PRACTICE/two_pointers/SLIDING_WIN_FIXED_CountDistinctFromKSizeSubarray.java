package com.hiru.dsa.java.PRACTICE.two_pointers;

import java.util.Arrays;
import java.util.HashMap;

public class SLIDING_WIN_FIXED_CountDistinctFromKSizeSubarray {
    ///////////////////////////////////////////
    public static void main(String args[]) {
        int arr[] = new int[]{5, 4, 3, 5, 4, 3, 2, 2, 1, 2, 6, 7, 4, 3, 2};

        int k = 5;
        printDistinctElementCountPerKSizeWin(arr, arr.length, k);

    }

    private void display(int[] arr, int start, int end) {

    }

    ///////////////////////////////////////////
    static void printDistinctElementCountPerKSizeWin(int arr[], int size, int k) {
        System.out.println(Arrays.toString(arr) + "\n\n");

        // Base cases
        if (size <= 1) {
            System.out.println(size);
        }
        int iStart = 0, iEnd = 0;
        // ------------ PART1:  Window--INIT STATE (First Window) ---------
        int winInd = iStart + k;
        HashMap<Integer, Integer> windowMap = new HashMap<>();
        for (iEnd = iStart; iEnd < winInd; iEnd++) {
            if (windowMap.containsKey(arr[iEnd])) {
                windowMap.put(arr[iEnd], windowMap.get(arr[iEnd]) + 1);
            } else {
                windowMap.put(arr[iEnd], 1);
            }
        }
        System.out.println("Window (S:E): " + iStart + ":" + (iEnd - 1) + " ===> " + windowMap.keySet().size()); // Print windowMap elements count
        iStart++;
        // At this point, we have next window available for processing
        // ------------ PART2:  Window--SLIDE STATE (int by int) ---------
        while (iEnd < size) {
            //Remove iStart-1 element occurance
            if (windowMap.get(arr[iStart - 1]) == 1) {
                windowMap.remove(arr[iStart - 1]);
            } else {
                windowMap.put(arr[iStart - 1], windowMap.get(arr[iStart - 1]) - 1);
            }
            //Add iEnd element occurance
            if (windowMap.containsKey(arr[iEnd])) {
                windowMap.put(arr[iEnd], windowMap.get(arr[iEnd]) + 1);
            } else {
                windowMap.put(arr[iEnd], 1);
            }

            System.out.println("Window (S:E): " + iStart + ":" + iEnd + " ===> " + windowMap.keySet().size()); // Print windowMap elements count
            // Shift window
            iStart++;
            iEnd++;
        }
    }
}

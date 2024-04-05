package com.hiru.dsa.java.algomonster;

import com.hiru.dsa.java.util.MyLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem: https://algo.monster/problems/newspapers_split
 */
public class BinarySearch_Newspaper {
    public static int newspapersSplit(List<Integer> newspapersReadTimes, int numCoworkers) {
        MyLogger.info("-------------------Newspaper read time: " + newspapersReadTimes);

        int low = Collections.max(newspapersReadTimes);
        MyLogger.info("-------------------Min Time: " + low);
        int high = 0;
        int ans = -1;
        for (int readTime : newspapersReadTimes)
            high += readTime;
        MyLogger.info("-------------------Max Time: " + high);
        while (low <= high) {
            int mid = (low + high) / 2;
            MyLogger.info("-------Mid(Chunk limit) Time: " + mid);
            // helper function to check if a time works
            if (feasible(newspapersReadTimes, numCoworkers, mid)) {
                MyLogger.info("Feasible: YES");
                ans = mid; // Keep track of LAST feasible answer and try to find MORE optimal answer before exiting loop
                high = mid - 1;
            } else {
                MyLogger.info("Feasible: NO");
                low = mid + 1;
            }
        }
        MyLogger.info("--------------------------Min Reading time for " + newspapersReadTimes
                + " with " + numCoworkers + " workers is: " + ans);

        return ans;
    }

    public static boolean feasible(List<Integer> newspapersReadTimes, int numCoworkers, int limit) {
        // time to keep track of the current worker's time spent, num_workers to keep track of the number of coworkers used
        int time = 0, numWorkers = 0;
        for (int readTime : newspapersReadTimes) {
            // check if current time exceeds the given time limit
            if (time + readTime > limit) {
                time = 0;// reset accumulated(previous worker time) for next coworker and increment the count of coworker
                numWorkers++;
            }
            time += readTime; // Increemnt time for current coworker
        }
        // edge case to check if we needed an extra coworker at the end
        if (time != 0) {
            numWorkers++;
        }
        MyLogger.info("Num Workers: " + numWorkers);
        // check if the number of workers we need is more than what we have
        return numWorkers <= numCoworkers;
    }


    public static void main(String[] args) {

        List<Integer> newspapersReadTimes = new ArrayList<>();
        newspapersReadTimes.add(7);
        newspapersReadTimes.add(2);
        newspapersReadTimes.add(5);
        newspapersReadTimes.add(10);
        newspapersReadTimes.add(8);

        int numCoworkers = 2;

        int res = newspapersSplit(newspapersReadTimes, numCoworkers);
        System.out.println(res);
    }
}

/**
 * Debugging:
 *
 * INFO:-------------------Newspaper read time: [7, 2, 5, 10, 8]
 * INFO:-------------------Min Time: 10
 * INFO:-------------------Max Time: 32
 *
 *
 *
 * INFO:-------Mid(Chunk limit) Time: 21
 * INFO:Num Workers: 2
 * INFO:Feasible: YES
 *
 * INFO:-------Mid(Chunk limit) Time: 15
 * INFO:Num Workers: 3
 * INFO:Feasible: NO
 *
 * INFO:-------Mid(Chunk limit) Time: 18
 * INFO:Num Workers: 2
 * INFO:Feasible: YES
 *
 * INFO:-------Mid(Chunk limit) Time: 16
 * INFO:Num Workers: 3
 * INFO:Feasible: NO
 *
 * INFO:-------Mid(Chunk limit) Time: 17
 * INFO:Num Workers: 3
 * INFO:Feasible: NO
 *
 *
 * INFO:--------------------------Min Reading time for [7, 2, 5, 10, 8] with 2 workers is: 18
 */
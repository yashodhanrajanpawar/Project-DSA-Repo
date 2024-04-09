package com.hiru.dsa.java.PRACTICE._mixed.TwoPointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Variable Size Sliding Window Problem. Use p1 and p2 for tracking and maxValue as windowRange satishfying constraints
 */
class LongestSumarrayNotExceedingSum {
    public static int subarraySumLongest(List<Integer> nums, int target) {
        //------------ 1. BASE CASES
        int size = nums.size();
        if (size == 0) {
            return -1;
        }
        if (size == 1 && target == nums.get(0)) {
            return 1;
        }
        //------------ 1. Initial State for Sliding Window
        int maxwindowLength = -1;
        int p1 = 0, p2 = 1;
        int sum = 0;
        sum += nums.get(0); // Add 0th element
        //------------ 2. Any luck in Initial State ? (P1=0 check)
        if (sum == target) {
            maxwindowLength = 1;
        }
        //------------ 3. Sliding window with initial state as (p1=0, p2=1)
        while (p2 < nums.size()) {
            int next = nums.get(p2);
            //------3.1 Increment p2 for zeros (valid element)
            if (next == 0) {
                // LEARNING -----Never miss some required operation in ANY BRANCH
                maxwindowLength = Math.max(p2 - p1, maxwindowLength);
                p2++;
            } else {
                //------3.2 Addition to window violates the condition..p2 - p1
                if (sum + next > target) {
                    // SUCCESS-- Update solution (dont include current element in the final size)
                    maxwindowLength = Math.max(p2 - p1, maxwindowLength);
                    // Slide window to next
                    sum -= nums.get(p1);
                    sum += next; // Add it now
                    p1++;
                    p2++;
                }
                //------3.3 Addition Leading to exact match...p2-p1+1
                else if (sum + next == target) {
                    // SUCCESS-- Update solution (Include +1 for current element)
                    maxwindowLength = Math.max((p2 - p1) + 1, maxwindowLength);
                    // Slide by single int
                    sum -= nums.get(p1);
                    sum += next; // Add it now
                    p1++;
                    p2++;
                }
                //------3.4 Further addition is still possible ( continue to next p2)
                else {
                    sum += nums.get(p2);
                    p2++;
                }
            }
        }
        return maxwindowLength;
    }


    public static void main(String[] args) {
        //nums = [1, 6, 3, 1, 2, 4, 5] and target = 10
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(5);

        int target = 10;


        int res = subarraySumLongest(nums, target);
        System.out.println(res);
    }
}


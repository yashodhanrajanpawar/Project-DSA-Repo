package com.hiru.dsa.java.algomonster;

/**
 * Problem: https://algo.monster/problems/sqrt
 */
class Solution {
    public static int squareRoot(int n) {
        if (n == 0) return 0;
        int left = 1;
        int right = n; // CATCH: Explore range of [1:N]
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if we got the square root
            if (mid == n / mid) {
                return mid; // CASE1: Exact square root..return exact square root.
            } else if (mid > n / mid) {
                res = mid; // CASE2: Estimated  square root..Preserve
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // We got some estimated suare root in bin search.
        // Return the res-1 ( due to > condition inside while)
        return res - 1;
    }

    public static void main(String[] args) {
        int res = squareRoot(16);
        System.out.println(res);
    }
}

package com.hiru.dsa.java.PRACTICE.arrays;

/**
 * LEETCODE: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 *
 * A conveyor belt has packages that must be shipped from one port to another within days days.
 * The ith package on the conveyor belt has a weight of weights[i].
 * Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
 * We may not load more weight than the maximum weight capacity of the ship.
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
 */
public class BINARY_SEARCH_LeetCode_ShipWeightMinCapacity {
    public static void main(String args[]) {
        int[] weights = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(getMinShipCapacity(weights, days));
    }

    public static int getMinShipCapacity(int[] weights, int days) {
        int maxWeight = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            int currentItem = weights[i];
            maxWeight = Math.max(currentItem, maxWeight);
            sum += currentItem;
        }

        int l = maxWeight;
        int r = sum;

        int ans = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (canShipWithConstraint(weights, days, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static boolean canShipWithConstraint(int[] weights, int days, int shipSize) {
        int numDays = 0;
        int totalWeightPerShip = 0;
        for (int i : weights) {
            if (i + totalWeightPerShip > shipSize) {
                numDays++;
                totalWeightPerShip = 0;
            }
            totalWeightPerShip += i;
        }

        if (totalWeightPerShip > 0)
            numDays++;

        return numDays <= days;
    }
}

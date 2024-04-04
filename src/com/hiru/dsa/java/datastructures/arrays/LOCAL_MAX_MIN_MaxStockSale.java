package com.hiru.dsa.java.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LOCAL_MAX_MIN_MaxStockSale {
    // Program to find best buying and selling days


    /**
     * ONCE buy and sell to maximize profit
     */
    static int getMaxProfitForSingleTransaction(int arr[], int arr_size) {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        // O(N) loop to detect MIN element and MAX Diff
        for (i = 1; i < arr_size; i++) {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element; // Max diff with local Min
            if (arr[i] < min_element)
                min_element = arr[i]; // Update local Min
        }
        return max_diff;
    }

    // Solution structure
    static class Interval {
        int buy, sell;
    }

    /**
     * Multiple Buy and Sell to Maximize profit
     *
     * @param price
     * @param n
     */
    static void getMaxProfitForMultipleTransactions(int price[], int n) {
        // Prices must be given for at least two days
        if (n == 1)
            return;

        int count = 0;

        // Solution array
        ArrayList<Interval> sol = new ArrayList<>();

        // Traverse through given price array
        int i = 0;
        while (i < n - 1) {
            // ---------1. Find Local Minima (Try visiting each index and get local minima)
            while ((i < n - 1) && (price[i] > price[i + 1]))
                i++;
            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                break;

            Interval e = new Interval();
            // Store the index of minima
            e.buy = i;

            i++; // Move to next

            //--------- 2. Find Local Maxima.
            while ((i < n) && (price[i - 1] < price[i]))
                i++;
            // Store the index of maxima
            e.sell = i - 1;
            sol.add(e);
        }

        // print solution
        if (sol.size() == 0)
            System.out.println(
                    "There is no day when buying the stock "
                            + "will make profit");
        else {
            for (Interval intv : sol)
                System.out.println(
                        "Buy on day: " + intv.buy + " | " + "Sell on day : " + intv.sell);

        }
    }

    public static void main(String args[]) {

        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 695, 535};
        int n = price.length;
        System.out.println("================ Input: " + Arrays.toString(price) + "================");
        System.out.println("Buy and sell ONCE. ------------------");
        System.out.println("Max Stock Price:" + getMaxProfitForSingleTransaction(price, n));
        System.out.println("Buy and sell MULTIPLE times. ------------------");
        getMaxProfitForMultipleTransactions(price, n);


        // stock prices on consecutive days
        int[] price1 = {1, 4, 5, 6, 2, 3, 7, 8};
        n = price1.length;
        System.out.println("================ Input: " + Arrays.toString(price1) + "================");
        System.out.println("Buy and sell ONCE. ------------------");
        System.out.println("Max Stock Price:" + getMaxProfitForSingleTransaction(price1, n));
        System.out.println("Buy and sell MULTIPLE times. ------------------");
        getMaxProfitForMultipleTransactions(price1, n);

    }


// This code has been contributed by Mayank Jaiswal

}

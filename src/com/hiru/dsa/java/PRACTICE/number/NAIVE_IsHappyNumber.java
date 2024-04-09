package com.hiru.dsa.java.PRACTICE.number;

import java.util.ArrayList;

public class NAIVE_IsHappyNumber {
    public static void main(String args[]) {
        ///// Logic Start here
        int num = 1;
        System.out.println(getDigits(num));
        int count = 100;
        boolean isHappy = false;
        while (count > 0 || !isHappy) {
            ArrayList<Integer> digits = getDigits(num);
            num = getSumSquares(digits);
            if (num == 1) {
                isHappy = true;
            }
            count--;
        }
        if (isHappy)
            System.out.println("Happy!!!");
        else
            System.out.println("Not Happy");
        ///// Logic Start here
    }

    private static int getSumSquares(ArrayList<Integer> digits) {
        int sum = 0;
        for (Integer d : digits) {
            sum += d;
        }
        return sum;
    }

    private static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> dig = new ArrayList<>();
        while (num > 0) {
            dig.add(num % 10);
            num = num / 10;
        }
        return dig;
    }
}

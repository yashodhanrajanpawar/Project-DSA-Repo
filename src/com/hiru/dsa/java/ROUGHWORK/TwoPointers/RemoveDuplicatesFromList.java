package com.hiru.dsa.java.ROUGHWORK.TwoPointers;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicatesFromList {
    /**
     * Two pointers same direction with second pointer moving till condition.
     * * Second pointer move until condition and halts for time being until reset/bookkeeping is done for current window
     */
    public static int removeDuplicates(List<Integer> arr) {
        int size = arr.size();
        if (size == 0 || size == 1)
            return size;

        int curr = arr.get(0);
        int j = 1;

        // Dont use static array length since array is mutating here
        while (j < arr.size()) {
            if (curr == arr.get(j)) {
                arr.remove(j);
            } else {
                curr = arr.get(j);
                j++;
            }
        }

        return arr.size();
    }

    public static void main(String[] args) {
        /////////////////////////
        System.out.println("testcase-----------------");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list);
        removeDuplicates(list);
        System.out.println(list);

        /////////////////////////
        System.out.println("testcase-----------------");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
        removeDuplicates(list2);
        System.out.println(list2);

        /////////////////////////
        System.out.println("testcase-----------------");
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(3);
        list3.add(3);
        System.out.println(list3);
        removeDuplicates(list3);
        System.out.println(list3);
    }
}


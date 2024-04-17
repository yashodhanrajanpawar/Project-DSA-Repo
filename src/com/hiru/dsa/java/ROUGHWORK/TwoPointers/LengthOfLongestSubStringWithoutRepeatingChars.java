package com.hiru.dsa.java.ROUGHWORK.TwoPointers;

import java.util.HashSet;

public class LengthOfLongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {

        String str = "ABCDBEFGHEMHKLP";
        System.out.println(str + "|" + getLongestSubstringWithoutDuplicates(str));

    }

    /**
     * Two pointers Same direction with sliding window
     * Second pointer move until condition and halts for time being until reset/bookkeeping is done for current window
     */
    static int getLongestSubstringWithoutDuplicates(String str) {
        int i = 0;
        int j = 1;
        HashSet<Character> wind = new HashSet<>();
        // Add to window
        wind.add(str.charAt(i));
        int max = -1;


        while (j < str.length()) {
            Character ch = str.charAt(j);
            // Reset i to next character after last occurance of str[j]
            if (wind.contains(ch)) {
                // Set max//reset max
                max = Math.max(max, wind.size()); //This is the substring size (answer0
                // Find the duplicate character from past substring
                for (int k = i; k < j; k++) {
                    // Keep removing the past chars
                    if (ch == str.charAt(k)) {
                        i = k + 1;
                        // point to next character (retain its occurance in array for j)
                        break; // Dont do anything for the matching condition since
                        // jth character and kth characters are same let it REMAIN in hashset
                    }
                    // remove any other chars
                    wind.remove(str.charAt(k));
                }
            } else {
                wind.add(ch); //ADD newly seen char
            }
            j++;
        }
        return max;
    }
}

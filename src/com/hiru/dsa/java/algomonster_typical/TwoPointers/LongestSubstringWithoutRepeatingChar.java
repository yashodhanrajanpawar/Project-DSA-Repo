package com.hiru.dsa.java.algomonster_typical.TwoPointers;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String args[]) {
        //System.out.println("3|" + getLenOfLongestSubString("abccaba"));
        //System.out.println("1|" + getLenOfLongestSubString("aa"));
        System.out.println("1|" + getLenOfLongestSubString("A"));
    }

    private static int getLenOfLongestSubString(String s) {
        int max = 0;
        HashSet<Character> window = new HashSet<>();
        int p1 = 0;

        for (int p2 = 0; p2 < s.length(); p2++) {
            Character ch = s.charAt(p2);
            // Contains vs Not contain
            if (window.contains(ch)) {
                max = Math.max(max, window.size());

                // Slide Window P1 pointer and point to next index after old occurance of ch
                for (int k = p1; k < p2; k++) {
                    Character chOld = s.charAt(k);
                    window.remove(chOld);
                    if (ch == s.charAt(k)) {
                        p1 = k + 1;
                        break;
                    }
                }
                window.add(ch); // Redundant if we remove window.remove() call
                // ..Just added for visibility
            } else {
                window.add(ch);
            }
        }
        max = Math.max(max, window.size());
        return max;
    }
}

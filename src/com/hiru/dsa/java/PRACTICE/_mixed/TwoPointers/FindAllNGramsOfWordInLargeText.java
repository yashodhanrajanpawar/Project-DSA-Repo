package com.hiru.dsa.java.PRACTICE._mixed.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNGramsOfWordInLargeText {

    public static void main(String args[]) {
        System.out.println(getNGrams("nabanabannaabbaanana", "banana"));
        //System.out.println(getNGrams("wubudubuwubuthattrue", "ubutu"));


    }


    /**
     * BIG MISTAKES =====================================
     * 1. Assuming word does not have DUPLICATES :-(
     * 2. Used hashmap and list and adding logic
     * 3. Did not pay attension to sliding window template:
     * ..........1. Process First window and See if valid
     * ..........2. Start from window_size+1 until text.size
     * ..........3. Add (curr) char and remove char at (curr-window_size) position
     * ..........4. Compare the BASELINE Frequencies with the WINDOW frequencies
     * 4. Classic typos
     *
     * LEARNINGS =====================================
     * 1. Dont assume but if possible; Use int[26] array for storing char specific information. Its simpler than multivalue hashmap/lists etc.
     * 2. ch-'a' returns 0-25 integer values for a-z characters
     * 3. Just ++ or -- value at given char position for current TEXT char
     */
    public static List<Integer> getNGrams(String text, String word) {
        List<Integer> ans = new ArrayList<>();
        if (word != null && word.length() > 0 && text.length() >= word.length()) {
            // 1. PREPROCESSING----Populate word frequency array
            int[] BASELINE_FREQ = new int[26];

            // 2. Update BASELINE and first window frequencies (update both baseline and first window)
            int[] WINDOW_FREQ = new int[26];
            for (int k = 0; k < word.length(); k++) {
                BASELINE_FREQ[word.charAt(k) - 'a']++;
                WINDOW_FREQ[text.charAt(k) - 'a']++;
            }
            // 3. Check first success ?
            if (Arrays.equals(BASELINE_FREQ, WINDOW_FREQ))
                ans.add(0);

            //4. Iterate OVER all SLIDING WINDOW let say of size THREE:   [0, 1, 2, [[[3, 4, 5]]], 6, 7, 8, 9]
            // remove frequency of 3 and add frequency of 6
            // Check valid solution after each sliding window O(K*K*N)
            for (int iNextCharOutWin = word.length(); iNextCharOutWin < text.length(); iNextCharOutWin++) {
                // Step1 -- Remove ch1 freq ....ch1[WINDOWS]ch2
                WINDOW_FREQ[text.charAt(iNextCharOutWin - word.length()) - 'a']--; // SLIDING WIN LOGIC: DEC first char frequency
                // Step2 -- Add ch2 freq ....ch1[WINDOWS]ch2
                WINDOW_FREQ[text.charAt(iNextCharOutWin) - 'a']++; // SLIDING WIN LOGIC: INC curr char frequency
                // Step3 -- Comparison (K*K)
                if (Arrays.equals(BASELINE_FREQ, WINDOW_FREQ))
                    ans.add(iNextCharOutWin - word.length() + 1); // ***SUCCESS-- Solution found
            }
        }
        return ans; // Return indices where anagram was found
    }


}

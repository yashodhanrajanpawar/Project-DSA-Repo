package com.hiru.dsa.java.PRACTICE.string;

import java.util.HashMap;

public class NAIVE_StringDecode_RomanToInt {

    public static void main(String args[]) {
        HashMap<String, Integer> mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);

        System.out.println("I: 1------" + romanToInt("I", mapping));
        System.out.println("D: 500------" + romanToInt("D", mapping));
        System.out.println("VIII: 8------" + romanToInt("VIII", mapping));
        System.out.println("XIII: 13------" + romanToInt("XIII", mapping));
        System.out.println("IV: 4------" + romanToInt("IV", mapping));
        System.out.println("IX: 9------" + romanToInt("IX", mapping));
        System.out.println("CD: 400------" + romanToInt("CD", mapping));
        System.out.println("DM: 500------" + romanToInt("DM", mapping));
        System.out.println("LVIII: 58------" + romanToInt("LVIII", mapping));
        System.out.println("MCMXCIV: 1994------" + romanToInt("MCMXCIV", mapping));
    }

    static int romanToInt(String roman, HashMap<String, Integer> mapping) {

        int solution = 0;
        int i = 0;

        while (i < roman.length()) {
            //----- Get current character
            String ch1 = roman.substring(i, i + 1);
            int val1 = mapping.get(ch1);

            //----- Get next character (If possible and see subtract condition)
            if (i + 1 < roman.length()) {
                String ch2 = roman.substring(i + 1, i + 2);
                int val2 = mapping.get(ch2);
                if (val1 < val2) {
                    solution += (val2 - val1); // Subtraction Logic
                    i += 2;
                    continue;
                }
            }
            solution += val1;
            i += 1;
        }
        return solution;
    }
}

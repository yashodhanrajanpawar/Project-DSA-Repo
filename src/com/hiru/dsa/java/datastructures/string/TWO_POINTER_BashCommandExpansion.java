package com.hiru.dsa.java.datastructures.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solved -- However string validity check is still pending
 * // Validations=============
 * 1. Trim
 * 2. Other characters than (char'a', 'b',......, ',', '{', '}'] ...O(N) ----FAIL
 * 2. Invalid Patterns: {{ ---- }} ---- ,, -----  ,} -----  }, ----  ,{ -----  {, -----OTHER special Chars
 * 3. Two pointer: p1={  && IndexOf({) < IndexOf(}) ==> FAIL
 */
public class TWO_POINTER_BashCommandExpansion {

    public static void main(String args[]) {
        List<String> solution = SOLUTION("echo{1,2,3}{x,y}{P,Q,R,S}");
        System.out.println("Solution Size(24) | " + solution.size());
        System.out.println(solution);
    }

    static List<String> SOLUTION(String cmd) {
        List<String> global = new ArrayList<>();


        //#### Step1: Trim all whitespaces
        //cmd = cmd.removeAll(' ');

        int i1 = 0;
        int i2 = 1;

        //##### Step2-- Preprocess--Parse (Assume)
        if (false /**! isValid(cmd)*/)
            return global;


        //#####step3-- first processing
        String first = cmd.substring(0, cmd.indexOf('{'));
        global.add(first);

        //##### Step4-- Subset processing in loop
        i1 = cmd.indexOf('{') + 1;
        i2 = i1;
        while (i2 < cmd.length()) {
            //### Process
            i2 = cmd.indexOf('}');
            String setStr = cmd.substring(i1, i2);
            List<String> local = Arrays.asList(setStr.split(","));
            //### Update remaining string

            //### Multiply with global and define new global
            global = combine(local, global);

            //### Reset (i1 and i2 to process next set)
            cmd = cmd.substring(i2 + 1);
            i1 = 1;
            i2 = i1;
        }
        return global;
    }

    static List<String> combine(List<String> local, List<String> global) {
        List<String> globalNew = new ArrayList<>();
        for (String s1 : global) {
            for (String s2 : local) {
                globalNew.add(s1 + s2);
            }
        }
        return globalNew;
    }
}

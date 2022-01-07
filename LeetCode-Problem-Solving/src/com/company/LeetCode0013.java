package com.example.leetcode_problem_solving.LeetCode;

import java.util.HashMap;
import java.util.Map;

class LeetCode0013 {
    public int romanToInt(String s) {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int result=0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);      // Current Roman Character

            //Case 1
            if(i>0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i-1)))
            {
                result += numbersMap.get(ch) - 2*numbersMap.get(s.charAt(i-1));
            }

            // Case 2: just add the corresponding number to result.
            else
                result += numbersMap.get(ch);
        }

        return result;
    }
}

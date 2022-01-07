package com.company;

import java.util.HashMap;
import java.util.Map;

class LeetCode0014 {
    public static void main(String[] args){
        String[] arr = {"flower","flow","flight", "flying"};
        System.out.println(longestCommonPrefix(arr));

        arr = new String[]{"radog","racecar","racar"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();

        if(strs == null || strs.length ==0){
            return longestCommonPrefix.toString();
        }

        int shortestWordLength = strs[0].length();
        for(int i=1; i<strs.length; i++){
            shortestWordLength = Math.min(shortestWordLength, strs[i].length());
        }

        for(int i=0; i<shortestWordLength; i++){

            char perChar = strs[0].charAt(i);

            for(String singleWord : strs){
                if(singleWord.charAt(i) != perChar){
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(perChar);

        }

        return longestCommonPrefix.toString();
    }
}

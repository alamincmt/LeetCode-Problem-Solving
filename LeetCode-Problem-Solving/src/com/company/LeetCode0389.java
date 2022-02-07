package com.company;

class LeetCode0389 {

    public static void main(String[] args){
        System.out.println(findTheDifference("abcdasdf", "abcdasdfz"));
    }

    public static char findTheDifference(String s, String t) {
        // return t.replace(s, "").charAt(0);

        int diff = 0;
        for(int i=0; i < s.length(); i++){
            diff = diff - s.charAt(i);
            diff = diff + t.charAt(i);
        }

        diff = diff + t.charAt(s.length());

        return (char) diff;
    }
}

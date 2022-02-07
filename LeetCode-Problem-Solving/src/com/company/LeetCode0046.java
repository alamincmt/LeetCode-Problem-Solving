package com.company;

import java.util.ArrayList;
import java.util.List;

class LeetCode0046 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Output size: " + permute(nums).size());
    }

    public static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //start from an empty list
        result.add(new ArrayList<Integer>());
        List<List<Integer>> current = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            current.clear();
            for (List<Integer> l : result) {
                // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size()+1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num[i]);
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    l.remove(j);
                }
            }
            result = new ArrayList<List<Integer>>(current);
        }
        return result;
    }
}

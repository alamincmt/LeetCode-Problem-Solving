package com.company;

class LeetCode0080 {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        System.out.println("Output: " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length < 3) return nums.length;
        int k = 2, id = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[id - 2]) {
                nums[id] = nums[i];
                id++;
            }
        }
        return id;
    }
}

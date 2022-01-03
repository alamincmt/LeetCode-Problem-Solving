package com.technobd.mad_mvvm_architecture;

public class LeetCode0009 {

    public static void main(String[] args){
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {

        int originalNum = x, reverseTemp = 0, remainder = 0;
        if(x < 0){
            return false;
        }

        while(x != 0){
            remainder = x%10;
            reverseTemp = (reverseTemp * 10) + remainder;
            x = x/10;
        }

        if(originalNum == reverseTemp){
            return true;
        }else{
            return false;
        }
    }

}

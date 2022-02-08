package com.company;

public class LeetCode0258 {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        // return num - 9 * ((num-1)/9);
        while(num > 9){
            int res = 0;
            while(num > 0){
                res += num%10;
                num /= 10;
            }

            num = res;
        }

        return num;
    }

}

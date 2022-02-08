package com.company;

// Reverse Integer Problem

public class LeetCode0007 {

    public static void main(String[] args) {
        System.out.println(reverse(-1123));
    }

    public static int reverse(int x) {
//         if(x > 0){
//             StringBuilder input1 = new StringBuilder();

//             // append a string into StringBuilder input1
//             input1.append(input1);

//             // reverse StringBuilder input1
//             return Integer.parseInt(input1.reverse());

//         }else{
//             String value = String.valueOf(x).replace("-", "");

//             StringBuilder input2 = new StringBuilder();

//             // append a string into StringBuilder input1
//             input2.append(input);

//             // reverse StringBuilder input1
//             return Integer.parseInt(input2.reverse());
//         }


        boolean sign = x > 0 ;
        x = Math.abs(x);
        int res = 0;
        while(x > 0){
            if( res > Integer.MAX_VALUE/10) return 0;
            res = res*10 + x%10;
            x = x/10;
        }

        return sign ? res : -res;

    }

}

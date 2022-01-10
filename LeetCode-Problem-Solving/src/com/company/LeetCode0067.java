package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

class LeetCode0067 {
    public static void main(String[] args){
        String numA = "11000101010100000100101001010101000101010101011010000101010100110010100101010101010100101010";
        String numB = "1010100101000101010101010101010010101001010010101100101010100101001010101010";
        System.out.println("Result Is: " + addBinary(numA, numB));
    }

    public static String addBinary(String a, String b) {
        /*int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);

        int resultNum = decimalA + decimalB;
        return Integer.toBinaryString(resultNum);*/

        int carry=0;
        StringBuilder s1=new StringBuilder(a);
        StringBuilder s2=new StringBuilder(b);
        StringBuilder res=new StringBuilder();
        s1.reverse();
        s2.reverse();
        int i=0,sum;
        while(i<a.length() || i<b.length()){
            sum= carry;
            if(i<a.length()) sum+= s1.charAt(i)-'0';
            if(i<b.length()) sum+= s2.charAt(i)-'0';
            if(sum==0){
                carry=0;
                res.append('0');
            }

            if(sum==1){
                carry=0;
                res.append('1');
            }

            if(sum==2){
                carry=1;
                res.append('0');
            }

            if(sum==3){
                carry=1;
                res.append('1');
            }

            i++;
        }

        if(carry==1)   res.append('1');
        res.reverse();
        return res.toString();
    }
}

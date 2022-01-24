package com.company;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0022 {

    public static void main(String[] args){
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        process("", n, n, result);
        System.out.println("" + result.toString());
        return result;
    }
    private static void process(String prefix, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(prefix);
            return;
        }
        if (left > 0) {
            process(prefix + '(', left - 1, right, result);
        }
        if (left < right) {
            process(prefix + ')', left, right - 1, result);
        }
    }
}
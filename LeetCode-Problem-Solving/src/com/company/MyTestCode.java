package com.company;

public class MyTestCode {

    static int count = 0;
    public static void main(String[] args){
        printSomething();
    }

    public static void printSomething(){
        count++;
        if(count == 5){
            return;
        }
        System.out.println("111111111-Recursive");
        printSomething();
        System.out.println("222222222-Backtrace");
    }
}

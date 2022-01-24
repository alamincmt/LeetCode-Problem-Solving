package com.company;

public class RectanglePrint {

    public static void main(String[] args) {
        printRectangle(25);
    }

    public static void printRectangle(int size){

        int firstRow = 0;
        int lastRow = size;

        for(int i=0; i<=size; i++){
            for(int j=0; j<=size; j++){

                if(i==firstRow){
                    System.out.print("*");
                }else if(i == lastRow){
                    System.out.print("*");
                }else{
                    if(j == firstRow){
                        System.out.print("*");
                    }else if(j==lastRow){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }

    }

}


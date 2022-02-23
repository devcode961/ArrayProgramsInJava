package com.dev.logic;
/*
This logic will print the Triangle Pattern from Right to left with spacing between numbers like below :
         1
       2 2
     3 3 3
   4 4 4 4
 5 5 5 5 5
 */
public class PrintRightToLeftTriangle {

    public static void main(String[] args) {
        int size = 18;
        for (int i=1;i<=9;i++){
            for (int j=1;j<=size;j++){
                if(j<=(size-2*i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j%2 != 0 ? " " : i+"");
                }
            }
            System.out.println();
        }
    }
}

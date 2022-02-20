package com.dev.logic;

public class PrintHillPattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i=6;i>=1;i--){
            for (int j=1;j<=6;j++){
                if(i>j){
                    System.out.print(" ");
                }
                else{
                    System.out.print(k+" ");
                }
            }
            k++;
            System.out.println();
        }
    }
}

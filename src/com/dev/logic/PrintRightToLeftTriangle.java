package com.dev.logic;

public class PrintRightToLeftTriangle {
    public static void main(String[] args) {
        int k = 1;
        for (int i=1;i<=5;i++){
            for (int j=5;j>=1;j--){
                if(j<=k){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
            }
            k++;
            System.out.println();
        }
    }
}

package com.dev.logic;

public class FloydTriangleOddNumber {
    public static void main(String[] args) {
        int k = 0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(2*k+1+" ");
                k++;
            }
            System.out.println();
        }
    }
}

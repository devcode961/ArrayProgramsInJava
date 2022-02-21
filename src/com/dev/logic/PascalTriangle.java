package com.dev.logic;

public class PascalTriangle {
    public static void main(String[] args) {
        int baseValue = 2;
        int power=0;
        for(int i=1;i<5;i++){
            for(int j = 1;j<=i;j++){
               int sum = (int) Math.pow(baseValue,power);
            }
        }
    }
}

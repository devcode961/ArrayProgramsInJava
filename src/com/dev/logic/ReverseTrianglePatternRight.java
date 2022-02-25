package com.dev.logic;

public class ReverseTrianglePatternRight {
    public static void main(String[] args) {
        int size=5;
        for(int i = 5;i>=1;i--){
            for(int j = 1; j<=5;j++){
                System.out.print(j<=size-i ? " ":i);
            }
            System.out.println();
        }
    }
}

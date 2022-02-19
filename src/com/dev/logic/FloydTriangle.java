package com.dev.logic;

public class FloydTriangle {
    public static void main(String[] args) {
        int k = 1;
        int z = 0;
        for (int i=0;i<6;i++){
            for (int j=0;j<=i;j++){
                System.out.print(k+j+" ");
                z = k+j;
            }
            k=z+1;
            System.out.println();
        }
    }
}

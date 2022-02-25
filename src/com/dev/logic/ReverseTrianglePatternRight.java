package com.dev.logic;
/*
Prints a number triangle in reverse order starting from left and decreasing towards right. See below

9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
    7 7 7 7 7 7 7
      6 6 6 6 6 6
        5 5 5 5 5
          4 4 4 4
            3 3 3
              2 2
                1
 */
public class ReverseTrianglePatternRight {
    public static void main(String[] args) {
        int size=18;
        for(int i = 9;i>=1;i--){
            for(int j = 1; j<=size;j++){
                if(j<=(size-2*i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j%2!=0 ? i : " ");
                }
            }
            System.out.println();
        }
    }
}

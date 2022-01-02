package com.dev.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        int []providedArray = {1,2,3,4,5,6};
        int arr_size = providedArray.length;
        System.out.println("Left rotate an array by n positions specified by user.");
        System.out.println("I am using naive approach of Array Rotate");
        System.out.println("Please enter number of positions to be shifted");
        Scanner scan = new Scanner(System.in);
        int num_pos = scan.nextInt();
        int []temp = Arrays.copyOfRange(providedArray,0,num_pos+1);

        for(int i=0;i<arr_size-num_pos;i++){
            providedArray[i] = providedArray[num_pos+i];
        }
        for (int i=0;i<num_pos;i++){
           providedArray[arr_size-1-i] = temp[num_pos-1-i];
        }
        System.out.println("Array Rotated by "+num_pos+" places : "+ Arrays.toString(providedArray));
    }
}

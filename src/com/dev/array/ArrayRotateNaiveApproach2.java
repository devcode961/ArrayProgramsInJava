package com.dev.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateNaiveApproach2 {
    public static void main(String[] args) {
        System.out.println("We will rotate the array by given number of positions");
        System.out.println("By shifting the array elements 1 at a time");
        System.out.println("Enter the number of positions to rotate");
        Scanner sc = new Scanner(System.in);
        int num_pos = sc.nextInt();
        int[] array = {1,2,3,4,5,6};
        int arr_last_index = array.length-1;
        if(!((num_pos > 0) && (num_pos <= array.length))){
            System.out.println("Invalid value : "+num_pos+" for array rotation");
            System.out.println("Program will exit");
            System.exit(1);
        }
        for(int i=0;i<num_pos;i++){
            int temp = array[0];
           rotateByOne(array);
           array[arr_last_index] = temp;
        }
        System.out.println("Array after left rotation by "+num_pos+" positions "+ Arrays.toString(array));
    }

    public static void rotateByOne(int... a){
         for(int i = 1;i<a.length;i++){
             a[i-1] = a[i];
         }
    }
}

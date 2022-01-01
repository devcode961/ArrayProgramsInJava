package com.dev.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Program to reverse array");
        int []num_arr = {1,2,3,4,5,6,7,8,9,10};
        int array_size = num_arr.length-1;
        int pivot_index = array_size/2;
        for(int i=0;i<=pivot_index;i++){
            int temp = num_arr[i];
            num_arr[i] = num_arr[array_size - i];
            num_arr[array_size - i] = temp;
        }
         System.out.println("Reversed array is : "+Arrays.toString(num_arr));
    }
}

package com.dev.array;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateRight {
    public static void main(String[] args) {
        System.out.println("This program demonstrates right rotation of Array by n positions");
        System.out.println("Enter number of positions to right shift");
        Scanner sc = new Scanner(System.in);
        int num_pos = sc.nextInt();
        int[] array = {1,2,3,4,5,6};
        int arr_last_index = array.length-1;
        if(!((num_pos > 0) && (num_pos <= array.length))){
            System.out.println("Invalid value : "+num_pos+" for array rotation");
            System.out.println("Program will exit");
            System.exit(1);
        }
        for(int i=0; i<num_pos;i++){
           int temp = array[arr_last_index];
            rightRotateByOne(array);
            array[0] = temp;
        }
        System.out.println("Right rotated array by "+num_pos+" "+ Arrays.toString(array));
    }
    public static void rightRotateByOne(int... a){
        for(int i = a.length-1;i>0;i--){
            a[i] = a[i-1];
        }
    }
}

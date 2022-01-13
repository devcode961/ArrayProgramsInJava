package com.dev.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationJugglingAlgorithm {

    public static void main(String[] args) {
        System.out.println("This program will use juggling algorithm to rotate array by specified positions");
        int[] providedArray = {1,2,3,4,5,6};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of positions for shifting");
        int pos = scan.nextInt();
        int arraySize = providedArray.length;
        if(pos<0){
            System.out.println("Incorrect value entered by user.Program will be terminated");
            System.exit(1);
        }
        rotateArray(providedArray,pos,arraySize);
        System.out.println("Array Rotated by "+pos +" positions "+ Arrays.toString(providedArray));
    }

    public static int calculateGCD(int arraySize, int pos){
        if(arraySize==0)
            return pos;
        if(pos==0)
            return arraySize;
        if(arraySize==pos)
            return arraySize;
        if(pos>arraySize)
            return calculateGCD(pos-arraySize,arraySize);
        else
            return calculateGCD(arraySize-pos,pos);
    }

    public static void rotateArray(int[] array, int pos,int arraySize){
        pos = pos%arraySize;
        int temp , j ,k;
        int numSets = calculateGCD(arraySize,pos);

        for(int i=0;i<numSets;i++){
            temp = array[i];
            j = i;
            while(true){
                k = j+pos;
                if(k>=arraySize)
                    k = k-arraySize;
                if(k==i)
                    break;
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
    }
}

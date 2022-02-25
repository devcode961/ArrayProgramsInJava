package com.dev.logic;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a =10, b=20;
        System.out.println("Before swapping a = "+a+" and b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "+a+" and b = "+b);
    }
}

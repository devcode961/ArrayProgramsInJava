package com.dev.logic;

import java.util.Scanner;

public class FizzBuzzLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for FizzBuzz test");
        int number = scanner.nextInt();
        System.out.println("User entered number: "+number);
        StringBuilder msg = new StringBuilder();

        if(number % 3 == 0){
            msg.append("Fizz");
        }
        if(number % 5 == 0){
            msg.append("Buzz");
        }
        System.out.println(msg);

        scanner.close();
    }
}

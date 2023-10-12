package com.nt.test.list;

import java.util.Scanner;

public class MaxNumberByDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numOfDigits = scanner.nextInt();

        if (numOfDigits < 1) {
            System.out.println("Please enter a valid positive number of digits.");
        } else if (numOfDigits > 18) {
            // Handling an edge case where the number of digits is too large to represent
            System.out.println("The maximum " + numOfDigits + "-digit number cannot be represented as an integer.");
        } else {
            long maxNumber = (long) Math.pow(10, numOfDigits) - 1;
            System.out.println("The maximum " + numOfDigits + "-digit number is: " + maxNumber);
        }

        scanner.close();
    }
}
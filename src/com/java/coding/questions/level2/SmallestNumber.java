package com.java.coding.questions.level2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int min;
        for(min = num % 10; num > 0; num /= 10) {
            int digit = num % 10;
            if (digit < min) {
                min = digit;
            }
        }

        System.out.println(" Smallest number in a digit is " + min);
    }
}

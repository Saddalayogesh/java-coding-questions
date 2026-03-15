package com.java.coding.questions.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int max;
        for(max = 0; num > 0; num /= 10) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
        }

        System.out.println(" largest number in a digit is " + max);
    }
}

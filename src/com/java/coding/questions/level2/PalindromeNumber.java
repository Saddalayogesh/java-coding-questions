package com.java.coding.questions.level2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();
        int original = num;

        int reverse;
        for(reverse = 0; num > 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        if (reverse == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println(" Not Palindrome");
        }

    }
}

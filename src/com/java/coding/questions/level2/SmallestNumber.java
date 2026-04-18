package com.java.coding.questions.level2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int min = num % 10;

        while (num > 0) {
            int digit = num % 10;
            if (digit < min) {
                min = digit;
            }
            num /= 10;
        }

        System.out.println("Smallest digit is " + min);
        scanner.close();
    }
}

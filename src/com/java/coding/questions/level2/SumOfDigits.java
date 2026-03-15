package com.java.coding.questions.level2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int sum;
        for(sum = 0; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }

        System.out.println(sum);
    }
}

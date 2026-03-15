package com.java.coding.questions.level2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int product;
        for(product = 1; num > 0; num /= 10) {
            int digit = num % 10;
            product *= digit;
        }

        System.out.println(product);
    }
}

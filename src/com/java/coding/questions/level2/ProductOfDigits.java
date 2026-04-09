package com.java.coding.questions.level2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        System.out.println(product);
        scanner.close();
    }
}

package com.java.coding.questions.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        int product;
        for(product = 1; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }

        sc.close();
    }
}

package com.java.coding.questions.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int digit = 0;
        int reverse = 0;

        while(num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
            System.out.println(reverse);
        }

    }
}

package com.java.coding.questions.level1;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        while (reverse != 0) {
            int digit = reverse % 10;
            System.out.println(digit);
            reverse /= 10;
        }
    }
}

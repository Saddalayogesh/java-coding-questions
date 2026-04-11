package com.java.coding.questions.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scanner.nextInt();

        int original = num;
        int sum = 0;
        int count = 0;

        int temp = num;

        if (temp == 0) count = 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        scanner.close();
    }
}

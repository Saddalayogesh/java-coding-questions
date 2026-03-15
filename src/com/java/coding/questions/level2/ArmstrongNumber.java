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

        for(int temp = num; temp > 0; ++count) {
            temp /= 10;
        }

        while(num > 0) {
            int digit = num % 10;
            sum += (int)Math.pow((double)digit, (double)count);
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}

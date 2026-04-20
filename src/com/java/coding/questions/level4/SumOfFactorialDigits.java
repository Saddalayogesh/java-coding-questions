package com.java.coding.questions.level4;

import java.util.Scanner;

public class SumOfFactorialDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for(int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        System.out.println("Sum of factorial of digits = " + sum);
        sc.close();
    }
}

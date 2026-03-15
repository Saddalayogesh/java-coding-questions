package com.java.coding.questions.level4;

import java.util.Scanner;

public class SumOfFactorialDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum;
        for(sum = 0; number > 0; number /= 10) {
            int digit = number % 10;
            int fact = 1;

            for(int i = 1; i <= digit; ++i) {
                fact *= i;
            }

            sum += fact;
        }

        System.out.println("Sum of factorial of digits = " + sum);
        sc.close();
    }
}

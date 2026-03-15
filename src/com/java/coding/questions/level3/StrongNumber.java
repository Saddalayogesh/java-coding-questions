package com.java.coding.questions.level3;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int original = num;

        int sum;
        for(sum = 0; num > 0; num /= 10) {
            int digit = num % 10;
            int fact = 1;

            for(int i = 1; i <= digit; ++i) {
                fact *= i;
            }

            sum += fact;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }

        sc.close();
    }
}

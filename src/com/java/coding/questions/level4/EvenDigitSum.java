package com.java.coding.questions.level4;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int num = 1; num <= N; ++num) {
            int temp = num;

            int sum;
            for(sum = 0; temp > 0; temp /= 10) {
                sum += temp % 10;
            }

            if (sum % 2 == 0) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

package com.java.coding.questions.level4;

import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        for(int num = 1; num <= N; ++num) {
            int temp = num;

            int reverse;
            for(reverse = 0; temp > 0; temp /= 10) {
                reverse = reverse * 10 + temp % 10;
            }

            if (reverse == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

package com.java.coding.questions.level4;

import java.util.Scanner;

public class OddDigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int num = 1; num <= N; ++num) {
            int temp = num;

            boolean isValid;
            for(isValid = true; temp > 0; temp /= 10) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

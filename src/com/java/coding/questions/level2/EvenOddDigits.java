package com.java.coding.questions.level2;

import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int evenCount = 0;

        int oddCount;
        for(oddCount = 0; num > 0; num /= 10) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
        }

        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);
        sc.close();
    }
}

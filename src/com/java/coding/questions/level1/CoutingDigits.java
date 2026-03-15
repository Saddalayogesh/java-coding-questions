package com.java.coding.questions.level1;

import java.util.Scanner;

public class CoutingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count;
        for (count = 0; num != 0; ++count) {
            num /= 10;
        }

        System.out.println("Total digits = " + count);
    }
}
package com.java.coding.questions.level4;

import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(i * i + " ");
        }

        sc.close();
    }
}

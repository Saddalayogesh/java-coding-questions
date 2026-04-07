package com.java.coding.questions.level4;

import java.util.Scanner;

public class FibonacciNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i < N; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(a);

        sc.close();
    }
}

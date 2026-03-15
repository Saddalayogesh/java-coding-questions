package com.java.coding.questions.level4;

import java.util.Scanner;

public class CustomSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; ++i) {
            System.out.println(i * (i + 1));
        }

        sc.close();
    }
}

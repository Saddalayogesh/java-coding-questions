package com.java.coding.questions.level4;

import java.util.Scanner;

public class OneSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        String num = "";

        for (int i = 1; i <= N; i++) {
            num = num + "1";
            System.out.println(num);
        }

        sc.close();
    }
}

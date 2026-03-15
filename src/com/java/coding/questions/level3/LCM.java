package com.java.coding.questions.level3;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();

        int max;
        for(max = Math.max(a, b); max % a != 0 || max % b != 0; ++max) {
        }

        System.out.println("LCM = " + max);
        sc.close();
    }
}

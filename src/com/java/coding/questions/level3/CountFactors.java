package com.java.coding.questions.level3;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i * i <= num; i++) {
            if(num % i == 0) {
                if(i * i == num) {
                    count++;        // perfect square
                } else {
                    count += 2;     // pair of factors
                }
            }
        }

        System.out.println("Total factors = " + count);
        sc.close();
    }
}

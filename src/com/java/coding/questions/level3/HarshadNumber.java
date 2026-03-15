package com.java.coding.questions.level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;

        int sum;
        for(sum = 0; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += digit;
        }

        if (num % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }

        sc.close();
    }
}

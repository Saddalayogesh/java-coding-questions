package com.java.coding.questions.level4;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number;
        int sum;
        for(number = sc.nextInt(); number >= 10; number = sum) {
            for(sum = 0; number > 0; number /= 10) {
                int digit = number % 10;
                sum += digit;
            }
        }

        System.out.println("Digital Root = " + number);
        sc.close();
    }
}

package com.java.coding.questions.level1;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");

        for(int num = sc.nextInt(); num != 0; num /= 10) {
            int digit = num % 10;
            System.out.println(digit);
        }

    }
}

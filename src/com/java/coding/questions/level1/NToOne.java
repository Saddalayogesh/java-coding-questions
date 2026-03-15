package com.java.coding.questions.level1;

import java.util.Scanner;
public class NToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  N: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; --i) {
            System.out.println(i);
        }

    }
}

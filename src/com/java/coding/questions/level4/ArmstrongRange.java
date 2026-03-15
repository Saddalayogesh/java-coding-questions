package com.java.coding.questions.level4;

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        for(int num = 1; num <= N; ++num) {
            int temp = num;
            int sum = 0;
            int count = 0;

            for(int temp2 = num; temp2 > 0; temp2 /= 10) {
                ++count;
            }

            while(temp > 0) {
                int digit = temp % 10;
                sum = (int)((double)sum + Math.pow((double)digit, (double)count));
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}

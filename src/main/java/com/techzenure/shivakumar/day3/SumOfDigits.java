package com.techzenure.shivakumar.day3;


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = findSumOfDigits(number);

        System.out.println("Sum of digits of " + number + " = " + sum);
        sc.close();
    }

    private static int findSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
    
}

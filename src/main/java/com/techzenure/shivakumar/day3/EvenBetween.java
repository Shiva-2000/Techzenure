package com.techzenure.shivakumar.day3;


import java.util.Scanner;

public class EvenBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the last number: ");
        int y = scanner.nextInt();

        scanner.close();

        if (x % 2 != 0) {
            x++; // Make sure x is even to include it in the range
        }

        System.out.println("Even Numbers between " + x + " and " + y + " are");
        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
        }
    }
}

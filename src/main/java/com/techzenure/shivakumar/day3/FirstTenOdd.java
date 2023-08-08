package com.techzenure.shivakumar.day3;



import java.util.Scanner;

public class FirstTenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many odd numbers to be generated: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }

        System.out.print("Exp O/P: ");
        int count = 0;
        int number = 1;

        while (count < n) {
            System.out.print(number + " ");
            number += 2;
            count++;
        }
        sc.close();
    }
}

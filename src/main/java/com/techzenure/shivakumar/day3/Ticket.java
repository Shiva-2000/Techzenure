package com.techzenure.shivakumar.day3;


import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of ticket: ");
        int numOfTickets = scanner.nextInt();

        if (numOfTickets < 5 || numOfTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            scanner.close();
            return;
        }

        System.out.print("Do you want refreshment (Y/N): ");
        char refreshmentChoice = scanner.next().charAt(0);

        System.out.print("Do you have coupon code (Y/N): ");
        char couponChoice = scanner.next().charAt(0);

        System.out.print("Enter the circle (K/Q): ");
        char circleChoice = scanner.next().charAt(0);

        scanner.close();

        double ticketCost;
        if (circleChoice == 'K') {
            ticketCost = numOfTickets * 75.0;
        } else if (circleChoice == 'Q') {
            ticketCost = numOfTickets * 150.0;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        if (refreshmentChoice == 'Y') {
            ticketCost += numOfTickets * 50.0;
        }

        if (numOfTickets > 20) {
            ticketCost *= 0.9;
        }

        if (couponChoice == 'Y') {
            ticketCost *= 0.98;
        }

        System.out.printf("Ticket cost: %.2f", ticketCost);
    }
}

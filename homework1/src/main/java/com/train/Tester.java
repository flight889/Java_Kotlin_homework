package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumOfTickets = 0;
        while (totalNumOfTickets != -1) {
            System.out.print("Please enter number of tickets: ");
            totalNumOfTickets = scanner.nextInt();
            if (totalNumOfTickets != -1) {
                System.out.print("How many round-trip tickets: ");
                int numOfRoundTripTickets = scanner.nextInt();

                Ticket ticket = new Ticket(totalNumOfTickets, numOfRoundTripTickets);
                ticket.print();
            }
        }
    }
}

package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int totalNumOfTickets  = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int numOfRoundTripTickets = scanner.nextInt();

        Ticket ticket = new Ticket(totalNumOfTickets, numOfRoundTripTickets);
        ticket.print();
    }
}

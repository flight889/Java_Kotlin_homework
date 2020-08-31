package com.train;

public class Ticket {
    int totalNumOfTickets;
    int numOfRoundTripTickets;

    public Ticket(int totalNumOfTickets, int numOfRoundTripTickets) {
        this.totalNumOfTickets = totalNumOfTickets;
        this.numOfRoundTripTickets = numOfRoundTripTickets;
    }

    public void print() {
        int ticketPrice = 1000;
        int roundTripTicketPrice = 1800;
        int totalPrice = numOfRoundTripTickets * roundTripTicketPrice + (totalNumOfTickets - numOfRoundTripTickets) * ticketPrice;
        System.out.println("Total tickets: " + totalNumOfTickets);
        System.out.println("Round-trip: " + numOfRoundTripTickets);
        System.out.println("Total: " + totalPrice);
    }
}

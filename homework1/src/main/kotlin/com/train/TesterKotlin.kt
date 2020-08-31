package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var totalNumOfTickets = 0
    while (totalNumOfTickets != -1) {
        print("Please enter number of tickets: ")
        totalNumOfTickets = scanner.nextInt()
        if  (totalNumOfTickets != -1) {
            print("How many round-trip tickets: ")
            var numOfRoundTripTickets = scanner.nextInt()

            val ticket = TicketKT(totalNumOfTickets, numOfRoundTripTickets)
            ticket.print()
        }
    }
}

class TicketKT (var totalNumOfTickets: Int, var numOfRoundTripTickets: Int) {
    fun print() {
        val ticketPrice = 1000
        val roundTripTicketPrice = 1800
        val totalPrice = numOfRoundTripTickets * roundTripTicketPrice + (totalNumOfTickets - numOfRoundTripTickets) * ticketPrice
        println("Total tickets: $totalNumOfTickets")
        println("Round-trip: $numOfRoundTripTickets")
        println("Total: $totalPrice")
    }
}
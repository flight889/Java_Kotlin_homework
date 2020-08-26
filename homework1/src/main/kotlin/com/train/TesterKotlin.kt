package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totalNumOfTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var numOfRoundTripTickets = scanner.nextInt()

    val ticket = TicketKT(totalNumOfTickets,numOfRoundTripTickets)
    ticket.print()
}

class TicketKT (var totalNumOfTickets: Int, var numOfRoundTripTickets: Int) {
    fun print() {
        val ticketPrice = 1000
        val RoundTripTicketPrice = 1800
        val totalPrice = numOfRoundTripTickets * RoundTripTicketPrice + (totalNumOfTickets - numOfRoundTripTickets) * ticketPrice
        println("Total tickets: " + totalNumOfTickets)
        println("Round-trip: " + numOfRoundTripTickets)
        println("Total: " + totalPrice)
    }
}
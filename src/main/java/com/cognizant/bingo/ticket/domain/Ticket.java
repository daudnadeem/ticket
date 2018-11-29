package com.cognizant.bingo.ticket.domain;

public class Ticket {
    private String ticketNumber;

    public Ticket() {}

    public Ticket(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}

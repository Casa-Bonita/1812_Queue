package com.company.homework5;

public class Buyer{

    private String name;
    private Ticket ticket;

    public Buyer() {
    }

    public Buyer(String name, Ticket ticket){
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    @Override
    public String toString(){
        return "Покупатель " + name + "  " + ticket.toString();
    }
}
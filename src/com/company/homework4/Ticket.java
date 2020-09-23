package com.company.homework4;

public class Ticket{

    private String row;
    private String seat;
    private int price;

    public Ticket() {
    }

    public Ticket(String row, String seat, int price){
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    public String getRow() {
        return row;
    }

    public String getSeat() {
        return seat;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "ряд - " + row + "  " + "место - " + seat + "  " + "цена - " + price;
    }
}
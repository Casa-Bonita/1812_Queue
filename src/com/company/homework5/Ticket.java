package com.company.homework5;

public class Ticket{

    private String row;
    private String seat;
    private int price;
    private String concert;

    public Ticket() {
        price = -1;

    }

    public boolean isNull(){
        return row==null || row.isEmpty() || seat == null || seat.isEmpty() || price == -1 || concert == null || concert.isEmpty();
    }


    public Ticket(String row, String seat, int price, String concert){
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.concert = concert;
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

    public String getConcert() {
        return concert;
    }

    @Override
    public String toString(){
        return "ряд - " + row + "  " + "место - " + seat + "  " + "цена - " + price + "  " + "концерт - " + concert;
    }
}
package com.company.homework5;

import java.util.*;

public class Operations{
    private int tempRow;
    private int tempSeat;
    private String row;
    private String seat;
    private int price;
    private String tempName = "Фамилия";
    private String name;

    Random rnd = new Random();

    public String row(){
        tempRow = rnd.nextInt(19) + 1;
        row = Integer.toString(tempRow);
        return row;
    }

    public String seat(){
        tempSeat = rnd.nextInt(99) + 1;
        seat = Integer.toString(tempSeat);
        return seat;
    }

    public int price(){
        price = rnd.nextInt(4001) + 999;
        return price;
    }

    public String name(int i){
        name = tempName + Integer.toString(i);
        return name;
    }
}
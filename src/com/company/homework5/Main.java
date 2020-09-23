package com.company.homework5;

import java.util.*;

// 5. Создать класс Ticket (билет на концерт) с private полями:
// - ряд;
// - место;
// - цена.
// Переопределить toString.
// Остальную структуру класса Ticket дополнить по необходимости.
//
// Создать класс Buyer(покупатель) с private полями:
// - String name; //имя
// - Ticket ticket; //билет на концерт
// Переопределить toString.
// Остальную структуру класса Buyer дополнить по необходимости.
//
// Всего билетов ограниченное количество, а желающих - нет. Поэтому на очень популярные концерты билетов на всех не хватает.
// Поэтому билеты должны достаться тем, кто позаботился о их приобретении заранее. Если после окончания концерта
// в очереди остались желающие, то нужно раздать билеты на новый концерт следующим в очереди и так до тех пор, пока очередь не опустеет.
//
// В main создать ArrayList билетов на 5 штук и очередь клиентов на 15 человек. (Очередь нужно создавать с помощью класса ArrayDequeue,
// так как PriorityQueue будет пытаться отсортировать очередь).
// Распределить билеты между покупателями в порядке живой очереди.
// Для каждого концерта вывести на консоль его порядковый номер и клиентов, которые на него попали.




public class Main{

    public static void main(String[] args) {



        String concert = "";
        Operations operations = new Operations();
        ArrayList<Ticket> listTicket = new ArrayList<>();

        ArrayList<Buyer> listBuyer1 = new ArrayList<>();
        ArrayList<Buyer> listBuyer2 = new ArrayList<>();
        ArrayList<Buyer> listBuyer3 = new ArrayList<>();

        ArrayDeque<String> myQueue = new ArrayDeque<String>();

        Buyer buyerPrint = new Buyer();

        for (int i = 0; i < 15; i++){
            // создание списка билетов
            if(i < 5){
                concert = "Концерт" + Integer.toString(1);
            }else if (10 <= i){
                concert = "Концерт" + Integer.toString(3);
            }else{
                concert = "Концерт" + Integer.toString(2);
            }

            Ticket ticket = new Ticket(operations.row(), operations.seat(), operations.price(), concert);
            listTicket.add(ticket);
            concert = "";
        }

        for (int i = 0; i < 15; i++){
            // генерация данных покупателей и добавление покупателей в очередь
            myQueue.addLast(operations.name(i));

        }

        // Распределение билетов на концерт № 1
        for (int i = 0; i < 5; i++) {
            Buyer buyer1 = new Buyer(myQueue.pollFirst(), listTicket.get(i));
            listBuyer1.add(buyer1);

        }

        System.out.println("\n" + "Печать списка людей с билетами, идущих на концерт № 1.");

        for (int i = 0; i < listBuyer1.size(); i++) {
            buyerPrint = listBuyer1.get(i);
            System.out.println(buyerPrint.toString());

        }

        System.out.println("\n" + "Печать списка людей с билетами, идущих на концерт № 2.");

        for (int i = 5; i < 10; i++) {
            Buyer buyer2 = new Buyer(myQueue.pollFirst(), listTicket.get(i));
            listBuyer2.add(buyer2);

        }

        for (int i = 0; i < listBuyer2.size(); i++) {
            buyerPrint = listBuyer2.get(i);
            System.out.println(buyerPrint.toString());

        }

        System.out.println("\n" + "Печать списка людей с билетами, идущих на концерт № 3.");

        for (int i = 10; i < 15; i++) {
            Buyer buyer3 = new Buyer(myQueue.pollFirst(), listTicket.get(i));
            listBuyer3.add(buyer3);

        }

        for (int i = 0; i < listBuyer3.size(); i++) {
            buyerPrint = listBuyer3.get(i);
            System.out.println(buyerPrint.toString());

        }
    }
}

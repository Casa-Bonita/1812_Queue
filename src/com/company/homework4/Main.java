package com.company.homework4;

// 4. В этой задаче используйте очередь, созданную в задаче 2 (возможно, ее надо будет изменить) или класс очереди из коробки
// Создать класс Ticket (билет на концерт) с private полями:
// - ряд;
// - место;
// - цена.
// Переопределить toString.
// Остальную структуру класса Ticket дополнить по необходимости.
//
// Создать класс Buyer (покупатель) с private полями:
// - String name; //имя
// - Ticket ticket; //билет на концерт
// Переопределить toString.
// Остальную структуру класса Buyer дополнить по необходимости.
//
// Всего билетов ограниченное количество, а желающих - нет. Поэтому на очень популярные концерты билетов на всех не хватает.
// Поэтому билеты должны достаться тем, кто позаботился об их приобретении заранее.
//
// В main создать ArrayList билетов на 10 штук и очередь клиентов на 15 человек.
// Распределить билеты между покупателями в порядке живой очереди.
// Вывести на консоль покупателей: тех, кому билеты достались и тех, кому не достались.
//
// Примечание.
// Если решите использовать очередь из коробки, то их две: ArrayDequeue и PriorityQueue. Нужно использовать ArrayDequeue, так как PriorityQueue
// будет пытаться отсортировать клиентов.

import java.util.*;

public class Main{

    public static void main(String[] args) {

        ArrayList<Ticket> listTicket = new ArrayList<>();
        ArrayList<Buyer> listBuyer = new ArrayList<>();
        ArrayDeque<String> myQueue = new ArrayDeque<String>();
        ArrayDeque<String> myQueueCopy = new ArrayDeque<String>(); // копия очереди myQueue. Будет удалена при создании списка людей с билетами

        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 15; i++){
            if(i < 10) { // создание очереди людей  + создание списка людей с билетами
                // генерация параметров билетов
                int tempRow = rnd.nextInt(19) + 1;
                String row = Integer.toString(tempRow);
                int tempSeat = rnd.nextInt(99) + 1;
                String seat = Integer.toString(tempSeat);
                int price = rnd.nextInt(4900) + 100;

                // создание списка билетов
                Ticket ticket = new Ticket(row, seat, price);
                listTicket.add(ticket);

                // генерация данных покупателей
                String tempName = "Фамилия";
                String name = tempName + Integer.toString(i);

                // добавление покупателей в очередь
                myQueue.addLast(name);
                myQueueCopy.addLast(name); // создание копии очереди

            }else{ // добавление в очередь оставшихся без билетов людей
                // генерация данных покупателей и добавление в очередь
                String tempName = "Фамилия";
                String name = tempName + Integer.toString(i);
                myQueue.addLast(name);

            }
        }

        // распределение билетов среди людей, находящихся в очереди
        for (int i = 0; i < listTicket.size(); i++) {
            Buyer buyer = new Buyer(myQueueCopy.pollFirst(), listTicket.get(i));
            listBuyer.add(buyer);
        }

        // печать данных
        System.out.println("\n" + "1. Печать списка людей с билетами.");

        for (int i = 0; i < listBuyer.size(); i++) {
            Buyer buyerPrint = new Buyer();
            buyerPrint = listBuyer.get(i);
            System.out.println(buyerPrint.toString());
            myQueue.removeFirst();
        }

        System.out.println("\n" + "2. Печать списка людей без билетов.");

        int size = myQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(myQueue.getFirst());  // чтобы очередь сохранилась печатаем первый элемент
            myQueue.addLast(myQueue.getFirst());     // добавляем его в хвост очереди
            myQueue.removeFirst();                   // удаляем первый элемент
//            String[] arr = (String[])myQueue.toArray();
        }
    }
}

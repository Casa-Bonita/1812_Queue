package com.company.homework2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

// Сделать свою очередь MyQueue c методами add, size, poll, peek;

        int n; //длина очереди
        int input; // выбор элемента консольного меню

        Queue<Integer> myQueue = new LinkedList<Integer>();

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите длину очереди:");
        n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int a = rnd.nextInt(49) + 1;
            myQueue.add(a);
        }

        int i = 0;
        for(int mq : myQueue) {
            System.out.println("Элемент очереди " + i + " = " + mq);
            i++;
        }

        System.out.println("\n" + "Метод \"add\"");
        System.out.println("Введите элемент для добавления:");
        input = scn.nextInt();
        myQueue.add(input);

        i = 0;
        for(int mq : myQueue) {
            System.out.println("Элемент очереди " + i + " = " + mq);
            i++;
        }

        System.out.println("\n" + "Метод \"size\"");
        System.out.println("Длина очереди: " + myQueue.size());

        System.out.println("\n" + "Метод \"poll\"");
        myQueue.poll();
        i = 0;
        for(int mq : myQueue) {
            System.out.println("Элемент очереди " + i + " = " + mq);
            i++;
        }

        System.out.println("\n" + "Метод \"peek\"");
        System.out.println("Элемент очереди 0 = " + myQueue.peek());
        System.out.println();
        i = 0;
        for(int mq : myQueue) {
            System.out.println("Элемент очереди " + i + " = " + mq);
            i++;
        }
    }
}

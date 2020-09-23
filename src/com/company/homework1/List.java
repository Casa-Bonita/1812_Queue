package com.company.homework1;

import java.util.*;

public class List {
    private Node head; // указатель на первый элемент
    private Node tail; // указатель на последний элемент

    public int create (){
        Random rnd = new Random();
        int a = rnd.nextInt(50);
        return a;
    }

    public void addFront(int data){
        Node a = new Node();
        a.data = data;
        if(head == null){ // если список пустой
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    public void addBack (int data) {
        Node a = new Node();
        a.data = data;
        if(tail == null) { // если список пустой
            head = a;
            tail = a;
        } else{
            tail.next = a;
            tail = a;
        }
    }

    public void size() {
        Node a = new Node();
        int index;

        if (head == null) { // проверка на наличие списка
            System.out.println("Размер списка = 0");
            return;
        }

        if (head == tail) {
            System.out.println("Размер списка = 1");
            return;
        }

        Node temp = head;
        index = 1;

        while (temp.next != null) {
            index++;
            temp.next = temp.next.next;
        }
        System.out.println("Размер списка = " + index);
    }

    public void getByDigit(int data){
        Node a = new Node();
        a.data = data;

        if(head == null){ // проверка на наличие списка
            System.out.println("Элементы в односвязном списке отсутствуют");
            return;
        }

        if (head.data == data){ // проверка на совпадение по номеру № 0
            System.out.println("Элемент " + head.data + " имеется в односвязном списке");
            System.out.println("Номер элемента в списке = 0");
            return;
        }

        int index = 1; // проверка на совпадение по всем остальным элементам списка (от 1 до последнего)
        Node temp = head;
        while (temp.next != null){
            if (temp.next.data == data){
                System.out.println("Элемент " + temp.next.data + " имеется в односвязном списке");
                System.out.println("Номер элемента в списке = " + index);
                return;
            }
            temp.next = temp.next.next;
            index++;
        }
    }

    public void getByIndex(int data){
        Node a = new Node();
        int index = data;

        if(head == null){ // проверка на наличие списка
            System.out.println("Элементы в односвязном списке отсутствуют");
            return;
        }

        if (index == 0){ // проверка на совпадение по номеру № 0
            System.out.println("Элемент под номером 0 имеется в односвязном списке = " + head.data);
            return;
        }

        int count = 1;
        Node temp = head;
        while (temp.next != null){
            if (count == index){
                System.out.println("Элемент под номером " + count + " имеется в односвязном списке = " + temp.next.data);
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void removeByDigit(int data){
        Node a = new Node();
        a.data = data;

        if(head == null){ // проверка на наличие списка
            System.out.println("Элементы в односвязном списке отсутствуют");
            return;
        }

        if (head == tail && head.data == data){ // если список состоит из одного элемента
            head = null;
            tail = null;
            return;
        }

        if (head.data == data){ // если удаляем первый элемент списка
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            if (temp.next.data == data){
                if(tail == temp.next){
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void removeByIndex(int data) {
        Node a = new Node();
        int index = data;

        if (head == null) { // проверка на наличие списка
            System.out.println("Элементы в односвязном списке отсутствуют");
            return;
        }

        if (head == tail) { // если список состоит из одного элемента
            head = null;
            tail = null;
            return;
        }

        if (index == 0) { // если удаляем первый элемент списка
            head = head.next;
            System.out.println("Элемент под номером 0 удален из односвязного списка");
            return;
        }

        Node temp = head;
        int count = 1;
        while (temp.next != null) {
            if (count == index) {
                temp.next = temp.next.next;
                System.out.println("Элемент под номером " + count + " удален из односвязного списка");
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }













}

package com.company.homework1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

// Сделать свой односвязный список с методами add, get, contains, remove, size.

        List m = new List();
        int input = 0;
        Scanner scn = new Scanner(System.in);

        while (input != 8) {
            System.out.println();
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Генерация односвязного списка.");
            System.out.println("2. Вывод списка на экран.");
            System.out.println("3. Добавление элемента в список.");
            System.out.println("4. Получение элемента из списка.");
            System.out.println("5. Проверка наличия элемента в списке.");
            System.out.println("6. Удаление элемента из списка.");
            System.out.println("7. Определение длины списка.");
            System.out.println("8. Выход.");

            input = scn.nextInt();

            if (input == 1) {
                System.out.println("\n" + "Введите размер списка:");
                int tempSize = scn.nextInt();
                System.out.println("\n" + "Выберите метод создания списка:");
                System.out.println("1. Добавление элементов в конец списка.");
                System.out.println("2. Добавление элементов в начало списка.");
                System.out.println("3. Произвольное добавление (программа случайным образом добавляет элементы в начало или конец списка.");
                int tempChoice = scn.nextInt();
                if (tempChoice == 1){
                    System.out.println("Добавление в конец списка");
                    for (int i = 0; i < tempSize; i++) {
                        int temp = m.create();
                        m.addBack(temp);
                        m.printList();
                    }
                    System.out.println("\n" + "Итоговый односвязный список");
                    m.printList();

                } else if (tempChoice == 2){
                    System.out.println("Добавление в начало списка");
                    for (int i = 0; i < tempSize; i++) {
                        int temp = m.create();
                        m.addFront(temp);
                        m.printList();
                    }
                    System.out.println("\n" + "Итоговый односвязный список");
                    m.printList();

                } else if (tempChoice == 3) {
                    Random rnd = new Random();
                    for (int i = 0; i < tempSize; i++) {
                        int tempRandom = rnd.nextInt(2);
                        int temp = m.create();
                        if(tempRandom == 0){
                            m.addBack(temp);
                            System.out.println("Добавление в конец списка");
                            m.printList();
                        } else {
                            m.addFront(temp);
                            System.out.println("Добавление в начало списка");
                            m.printList();
                        }
                    }
                    System.out.println("\n" + "Итоговый односвязный список");
                    m.printList();
                } else {
                    System.out.println("Некорректный ввод");
                }


            }else if (input == 2) {
                    System.out.println("\n" + "Односвязный список:");
                    m.printList();

            } else if (input == 3) {
                int tempInput = 0;
                System.out.println("\n" + "Выберите куда будет добавляться элемент:");
                System.out.println("1. В начало списка.");
                System.out.println("2. В конец списка.");
                tempInput = scn.nextInt();

                if (tempInput == 1) {
                    System.out.println("Введите элемент:");
                    int a = scn.nextInt();
                    m.addFront(a);
                    System.out.println("Элемент добавлен в начало списка");
                    m.printList();
                } else if (tempInput == 2) {
                    System.out.println("Введите элемент:");
                    int a = scn.nextInt();
                    m.addBack(a);
                    System.out.println("Элемент добавлен в начало списка");
                    m.printList();
                } else {
                    System.out.println("Некорректный ввод");
                }

            } else if (input == 4) {
                int tempInput = 0;
                System.out.println("\n" + "Выберите каким образом будет получен элемент из списка:");
                System.out.println("1. По порядковому номеру.");
                System.out.println("2. По числовому значению элемента.");
                tempInput = scn.nextInt();

                if (tempInput == 1) {
                    System.out.println("Введите порядковый номер элемента:");
                    int a = scn.nextInt();
                    m.getByIndex(a);
                    m.printList();
                } else if (tempInput == 2) {
                    System.out.println("Введите числовое значение элемента:");
                    int a = scn.nextInt();
                    m.getByDigit(a);
                    m.printList();
                } else {
                    System.out.println("Некорректный ввод");
                }

            } else if (input == 5) {
                System.out.println("Введите числовое значение элемента:");
                int a = scn.nextInt();
                m.getByDigit(a);
                m.printList();

            } else if (input == 6) {
                int tempInput = 0;
                System.out.println("\n" + "Выберите каким образом будет удален элемент из списка:");
                System.out.println("1. По порядковому номеру.");
                System.out.println("2. По числовому значению элемента.");
                tempInput = scn.nextInt();

                if (tempInput == 1) {
                    System.out.println("Введите порядковый номер элемента:");
                    int a = scn.nextInt();
                    m.removeByIndex(a);
                    m.printList();
                } else if (tempInput == 2) {
                    System.out.println("Введите числовое значение элемента:");
                    int a = scn.nextInt();
                    m.removeByDigit(a);
                    m.printList();
                } else {
                    System.out.println("Некорректный ввод");
                }

            } else if (input == 7) {
                System.out.println("\n" + "Односвязный список:");
                m.size();

            }else if (input == 8) {
                System.out.println("\n" + "Программа завершила свою рабоу");
                break;

            } else {
                System.out.println("\n" + "Некорректный ввод");
            }

        }
    }
}

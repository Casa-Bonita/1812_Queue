package com.company.homework3;

import java.util.*;

public class Main {

    public static void main(String[] args) {


// Создать список фильмов для просмотра "на потом". Нужно помочь пользователю поддерживать этот список в уникальном виде.
// Потому что наш пользователь очень занятой и забывчивый. Он постоянно находит интересный фильм и добавляет его в список "посмотреть потом".
// Но наш пользователь никак не может найти свободного времени на просмотр и в списке уже скопилось столько фильмов,
// что пользователь не помнит, что он добавлял в него, а что еще нет.
//
// В main создать список фильмов. Так как он должен быть уникальным, нужно использовать множество, например, HashSet.
// Названия фильмов пользователь вводит с консоли.
// Создать меню:
// 1. Добавить фильм;
// 2. Вывести список фильмов;
// 3. Выход (программа должна завершаться при выборе пункта 3).
//
// При выборе пункта 1 пользователь вводит название фильма с консоли как уникальное, так и дубликат.
// При выборе пункта 2 программа выводит только уникальные фильмы.

        String input = "";
        Scanner scn = new Scanner(System.in);

        Myhashset forHashSet = new Myhashset();
        Myhashmap forHashMap = new Myhashmap();

        while (!input.equals("3")){
            System.out.println();
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Добавить фильм.");
            System.out.println("2. Вывести список фильмов.");
            System.out.println("3. Выход.");

            input = scn.nextLine();

            if (input.equals("1")) {
                System.out.println("\n" + "Введите название фильма:");
                String filmWithSymbols = "";
                filmWithSymbols = scn.nextLine();

                String storageType = "";

                System.out.println("\n" + "Выберите способ хранения коллекции:");
                System.out.println("1. HashSet.");
                System.out.println("2. HashMap.");
                storageType = scn.nextLine();

                if(storageType.equals("1")){
                    Titlecorrectionstring title = new Titlecorrectionstring ();
                    String filmAfterCorrection = title.Titlecorrectionstring(filmWithSymbols);

                    forHashSet.addHashSet(filmAfterCorrection);

                }else if(storageType.equals("2")){
                    Titlecorrectioninteger title = new Titlecorrectioninteger ();
                    int sumAfterCorrection = title.Titlecorrectioninteger(filmWithSymbols);

                    Myhashmap forHashCode = new Myhashmap(sumAfterCorrection);
                    int hashCode = forHashCode.hashCode();

                    forHashMap.putHashMap(hashCode, filmWithSymbols);

                }else{
                    System.out.println("Некорректный ввод.");
                }

            }else if (input.equals("2")){
                String storageChoice = "";
                System.out.println("\n" + "Выберите коллекцию для печати:");
                System.out.println("1. HashSet.");
                System.out.println("2. HashMap.");
                storageChoice = scn.nextLine();

                System.out.println("\n" + "Список фильмов в коллекции:");

                if(storageChoice.equals("1")){
                    forHashSet.printHashSet();

                }else if(storageChoice.equals("2")){
                    forHashMap.printHashMap();

                }else{
                    System.out.println("Некорректный ввод.");
                }

            }else if (input.equals("3")) {
                System.out.println("Программа завершила работу");
                break;
            }else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}

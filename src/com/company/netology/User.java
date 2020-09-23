package com.company.netology;

public class User implements Reader, Librarian, Supplier, Administrator{
    private int index;
    private double amount;

    // методы интерфейса Reader
    @Override
    public void takeBook() {
        System.out.println("Взяли книгу у библиотекаря");
    }

    @Override
    public void returnBook(){
        System.out.println("Вернули книгу библиотекарю");
    }

    // методы интерфейса Librarian
    @Override
    public void orderBook(){
        System.out.println("Заказали книгу у поставщика");
    }

    @Override
    public void extraditionBook(){
        System.out.println("Выдали книгу пользователю");
    }

    // методы интерфейса Supplier
    @Override
    public void bookShipment(){
        System.out.println("Поставили книги библиотекарю");
    }

    @Override
    public void bookPayment(){
        System.out.println("Запросили администратора об оплате поставленных книг");
    }

    // методы интерфейса Administrator
    @Override
    public void overdueNotification (){
        System.out.println("Предупредили читателя о просроченном сроке возврата книги");
    }

    @Override
    public void queryNotification (){
        System.out.println("Предупредили библиотекаря об отсутствии книги, если она не взята читателем");
    }
}
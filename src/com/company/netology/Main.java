package com.company.netology;

public class Main {
    public static void main(String[] args) {

        Reader reader = new User();
        reader.takeBook();
        reader.returnBook();

        Librarian librarian = new User();
        librarian.orderBook();
        librarian.extraditionBook();

        Supplier supplier = new User();
        supplier.bookShipment();
        supplier.bookPayment();

        Administrator administrator = new User();
        administrator.overdueNotification();
        administrator.queryNotification();


        // Переключение ролей

        Librarian librarian2 = (Librarian)reader; // из читателя сделаем библиотекаря
        librarian2.orderBook();
        librarian2.extraditionBook();

        Reader reader2 = (Reader)librarian;
        reader2.takeBook();
        reader2.returnBook();

        Administrator administrator2 = (Administrator)supplier;
        administrator2.overdueNotification();
        administrator2.queryNotification();

        Supplier supplier2 = (Supplier)administrator;
        supplier2.bookShipment();
        supplier2.bookPayment();


    }
}

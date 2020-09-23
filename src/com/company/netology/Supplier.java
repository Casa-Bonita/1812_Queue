package com.company.netology;

// Поставщик книг – приносит книги в библиотеку.
public interface Supplier{

    // поставка книг библиотекарю
    public void bookShipment();

    // запрос администратору на оплату поставленных книг
    public void bookPayment();
}
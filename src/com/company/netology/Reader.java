package com.company.netology;

// Читатель – берет и возвращает книги.
public interface Reader{

    // взятие книги у библиотекаря
    public void takeBook();

    // возврат книги библиотекарю
    public void returnBook();
}
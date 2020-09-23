package com.company.netology;

// Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
public interface Administrator{

    // предупреждение читателя о просроченном сроке возврата книги
    public void overdueNotification ();

    // предупреждение библиотекарю об отсутствии книги, если она не взята читателем
    public void queryNotification ();
}
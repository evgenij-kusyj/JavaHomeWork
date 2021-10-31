package com.pb.kusyj.hw5;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setTitle ("Приключения");
        book1.setBookAuthor("Иванов И.И.");
        book2.setTitle("Словарь");
        book2.setBookAuthor("Сидоров А.В.");
        book3.setTitle("Энциклопедия");
        book3.setBookAuthor("Гусев К.В.");
        book1.setYearOfIssue( 2000 );
        book2.setYearOfIssue( 1980 );
        book3.setYearOfIssue( 2010 );

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.nameFIO = "Петров В.В.";
        reader2.nameFIO = "Коршунов О.И.";
        reader3.nameFIO = "Орловский Р.П.";
        reader1.faculty = "Экономический факультет";
        reader1.phone = "0981111111";
        reader1.libraryCard =  123456 ;
        reader1.dateOfBirth = " 01.01.1990";
        reader2.faculty = "Математический факультет";
        reader2.phone = "0631111111";
        reader2.libraryCard =  223456 ;
        reader2.dateOfBirth = "02.02.1995";
        reader3.faculty = "Юридический факультет";
        reader3.phone = "0501111111";
        reader3.libraryCard =  323456 ;
        reader3.dateOfBirth = "03.03.2000";

        reader1.takeBook(); // выводит строку из класса Reader, добавляя соответствующего читателя
        reader2.takeBook();
        reader3.takeBook();

        reader1.takeBook(reader1.nameFIO); // выводит строку из класса Reader, добавляя соответствующего читателя
        reader2.takeBook(reader2.nameFIO);
        reader3.takeBook(reader3.nameFIO);
        reader1.takeBook(reader2.nameFIO); // если указаны разные читатели в начале строки и в скобках,
                                            // выдаст имя из скобок

        reader1.takeBook(reader1.nameFIO, book1.getTitle(), book2.getTitle(), book3.getTitle()); //

        reader1.takeBook(reader1.nameFIO, book1.getTitle(), book1.getBookAuthor(), book1.getYearOfIssue(),
                book2.getTitle(), book2.getBookAuthor(), book2.getYearOfIssue(),
                book3.getTitle(), book3.getBookAuthor(), book3.getYearOfIssue());

        reader1.returnBook(reader1.nameFIO);
        reader1.returnBook(reader1.nameFIO, book1.getTitle(), book2.getTitle(), book3.getTitle());
        reader1.returnBook(reader1.nameFIO, book1.getTitle(), book1.getBookAuthor(), book1.getYearOfIssue(),
                book2.getTitle(), book2.getBookAuthor(), book2.getYearOfIssue(),
                book3.getTitle(), book3.getBookAuthor(), book3.getYearOfIssue());

        System.out.println(reader1.nameFIO+", "+reader1.libraryCard+", "+reader1.faculty+", "+reader1.dateOfBirth+", "+reader1.phone);
        System.out.println(reader2.nameFIO+", "+reader2.libraryCard+", "+reader2.faculty+", "+reader2.dateOfBirth+", "+reader2.phone);
        System.out.println(reader3.nameFIO+", "+reader3.libraryCard+", "+reader3.faculty+", "+reader3.dateOfBirth+", "+reader3.phone);

        System.out.println(book1.getTitle()+", "+book1.getBookAuthor()+", "+book1.getYearOfIssue());
        System.out.println(book2.getTitle()+", "+book2.getBookAuthor()+", "+book2.getYearOfIssue());
        System.out.println(book3.getTitle()+", "+book3.getBookAuthor()+", "+book3.getYearOfIssue());
    }
}

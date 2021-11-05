package com.pb.kusyj.hw5;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И.И.", 2000);
        books[1] = new Book("Словарь", "Сидоров А.В.", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);

        Reader[] readers = new Reader[25];
        readers[0] = new Reader("Петров В.В.", 123456, "Экономический факультет",
                " 01.01.1990", "0981111111");
        readers[1] = new Reader("Коршунов О.И.", 223456, "Математический факультет",
                "02.02.1995", "0631111111");
        readers[2] = new Reader("Орловский Р.П.", 323456, "Юридический факультет", "03.03.2000", "0501111111");

        for (int i = 0; i < 3; i++) {
            System.out.println(books[i].getTitle() + ", " + books[i].getAuthor() + ", " + books[i].getYear());
        }
        for (int o = 0; o < 3; o++) {
            System.out.println(readers[o].getNameFIO() + ", " + readers[o].getDateOfBirth() + ", " + readers[o].getLibraryCard() +
                    ", " + readers[o].getFaculty() + ", " + readers[o].getPhone());
        }

        int bookCount = 3;
        readers[0].takeBook(bookCount);
        readers[1].takeBook(books[0].getTitle(), books[1].getTitle(),books[2].getTitle()); //
        readers[1].takeBook(books[2], books[1], books[0]);

        readers[0].returnBook(bookCount);
        readers[1].returnBook(books[0].getTitle(), books[1].getTitle(), books[2].getTitle()); //
        readers[2].returnBook(books[0], books[1],books[2]);
    }
}

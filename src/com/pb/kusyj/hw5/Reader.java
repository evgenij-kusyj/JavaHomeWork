package com.pb.kusyj.hw5;
import java.util.Scanner;

public class Reader {
    String nameFIO;             // ФИО
    int libraryCard;            //  номер читательского билета
    String faculty;             // факультет
    String dateOfBirth;            // дата рождения
    String phone;                  // телефон

    public void takeBook() {   // метод берет ФИО  читателя, который будет выбран в классе Library(reader1,2,3)
        System.out.println("[" + nameFIO + " взял 3 книги]"); // передает строку в класс Library
    }

    public void takeBook(String nameFIO, String... numbers) { // метод берет ФИО соответствующего читателя(reader1,2,3)
        for (String number1: numbers) {
            System.out.println("\"" + nameFIO + " взял "+number1+ " книги\"");
        }
    }

    public void takeBook(String nameFIO, String title, String title1, String title2) { // будут выводиться 3 переменные с названием книги
        System.out.println("\"" + nameFIO + " взял книги: " + title+", "+title1+", "+title2+"\"");
    }

    public void takeBook(String nameFIO, String title, String bookAuthor, int yearOfIssue,
                         String title1, String bookAuthor1, int yearOfIssue1,
                         String title2, String bookAuthor2, int yearOfIssue2) {
        System.out.println("\""+nameFIO+" взял книги:"+title+" ("+bookAuthor+" "+yearOfIssue+"), "
                +title1+" ("+bookAuthor1 + yearOfIssue1+"), "
                +title2+" ("+bookAuthor2 + yearOfIssue2+")\"");
    }

    public void returnBook(String nameFIO, String number) {
        System.out.println("\"" + nameFIO + " вернул "+number+ " книги\"");
    }

    public void returnBook(String nameFIO, String title, String title1, String title2) { // будут выводиться 3 переменные с названием книги
        System.out.println("\"" + nameFIO + " вернул книги: " + title+", "+title1+", "+title2+"\"");
    }

    public void returnBook(String nameFIO, String title, String bookAuthor, int yearOfIssue,
                         String title1, String bookAuthor1, int yearOfIssue1,
                         String title2, String bookAuthor2, int yearOfIssue2) {
        System.out.println("\""+nameFIO+" вернул книги:"+title+" ("+bookAuthor+" "+yearOfIssue+"), "
                +title1+" ("+bookAuthor1 + yearOfIssue1+"), "
                +title2+" ("+bookAuthor2 + yearOfIssue2+")\"");
    }
}



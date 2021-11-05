package com.pb.kusyj.hw5;
import java.util.Scanner;

public class Reader {
    String nameFIO;             // ФИО
    int libraryCard;            //  номер читательского билета
    String faculty;             // факультет
    String dateOfBirth;            // дата рождения
    String phone;                  // телефон

    public Reader(String nameFIO, int libraryCard, String faculty, String dateOfBirth, String phone) {
        this.nameFIO = nameFIO;
        this.dateOfBirth = dateOfBirth;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.phone = phone;
    }
    public String getNameFIO() {        return nameFIO;    }
    public void setNameFIO(String nameFIO) {        this.nameFIO = nameFIO;    }

    public int getLibraryCard() {        return libraryCard;    }
    public void setLibraryCard(int libraryCard) {        this.libraryCard = libraryCard;    }

    public String getFaculty() {        return faculty;    }
    public void setFaculty(String faculty) {        this.faculty = faculty;    }

    public String getDateOfBirth() {        return dateOfBirth;    }
    public void setDateOfBirth(String dateOfBirth) {        this.dateOfBirth = dateOfBirth;    }

    public String getPhone() {        return phone;    }
    public void setPhone(String phone) {        this.phone = phone;    }

    public void takeBook(int bookCount) {
        System.out.println("[" + nameFIO + " взял "+bookCount +" книги]");
    }

    public void takeBook(String ...getTitle) {
        System.out.println("\""+nameFIO+" взял книги: "+ getTitle[0] +", "+getTitle[1] +", "+getTitle[2] + "\"");
    }

    public void takeBook(Book... books) {
         System.out.print("\"" + nameFIO + " взял книги: ");
         for (int i = 0; i < 2; i++) {
             System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + " " + books[i].getYear()+"), ");
         }
       System.out.println(books[2].getTitle() + " (" + books[2].getAuthor() + " " + books[2].getYear()+")\"");
    }

    public void returnBook(int bookCount) {
        System.out.println("[" + nameFIO + " вернул "+bookCount +" книги]");
    }
    public void returnBook(String ...getTitle) {
        System.out.println("\""+nameFIO+" вернул книги: "+ getTitle[0] +", "+getTitle[1] +", "+getTitle[2] + "\"");
    }
    public void returnBook(Book...books) {
        System.out.print("\"" + nameFIO + " вернул книги: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + " " + books[i].getYear()+"), ");
        }
        System.out.println(books[2].getTitle() + " (" + books[2].getAuthor() + " " + books[2].getYear()+")\"");
    }
}

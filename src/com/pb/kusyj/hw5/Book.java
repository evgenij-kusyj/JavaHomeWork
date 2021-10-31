package com.pb.kusyj.hw5;

public class Book {
   private String title;                   // название
    private String bookAuthor;              // автор книги
    private int yearOfIssue;                // год издания

    public String getTitle() {
        return title;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}

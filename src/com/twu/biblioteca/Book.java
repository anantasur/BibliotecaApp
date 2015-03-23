package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private Integer year;

    public Book(String title, String author,Integer year ) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getBookDetails() {
        return this.title + " - " + this.author +  " - " + this.year;
    }

    public static String getHeader() {
        return "Title - Author - year of publication\n";
    }

}

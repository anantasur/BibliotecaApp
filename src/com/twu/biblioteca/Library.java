package com.twu.biblioteca;

import java.util.List;

public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String printBookList() {
        String statement = Book.getHeader() +
                "-------------------------------------------\n";
        for (Book book : getBookList())
            statement += book.getBookDetails() + "\n";
        return statement;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}

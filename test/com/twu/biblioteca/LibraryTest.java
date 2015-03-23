package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    List<Book> bookList;
    Library library;

    @Before
    public void setUp() throws Exception {
        this.bookList = new ArrayList<Book>();
        bookList.add(new Book("The Adventures of Sherlock Holmes","Arthur Conan Doyle",1987));
        bookList.add(new Book("Wings of Fire","A. P. J. Abdul Kalam",2004));
        bookList.add(new Book("Ramayana", "Valmiki",2001));
        bookList.add(new Book("Five Point Someone", "Chetan Bhagat",2010));
        this.library = new Library(bookList);
    }

    @Test
    public void test_library_should_have_list_of_all_4_books() {
        assertEquals(library.getBookList().size(),4);
    }

    @Test
    public void testGetBookListGivesTheListOfAllAvailableBooksInLibrary() {
        assertEquals(library.getBookList(),bookList);
    }

}

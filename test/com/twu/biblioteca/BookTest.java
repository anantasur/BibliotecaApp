package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void setUp() throws Exception {
        this.book = new Book("The Adventures of Sherlock Holmes","Arthur Conan Doyle",1987);
    }
    @Test
    public void testGetHeaderGivesTheHeader(){
        assertEquals(book.getHeader(), "Title - Author - year of publication\n");
    }
    @Test
    public void testBookDetailsGivesTheDetailsOfTheBook(){
        assertEquals(book.getBookDetails(), "The Adventures of Sherlock Holmes - Arthur Conan Doyle - 1987");
    }
}
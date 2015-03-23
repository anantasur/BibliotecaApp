package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {
    @Test
    public void testGetBannerDisplaysTheWelcomeMessage(){
        String expected = "Welcome to Biblioteca.";
        assertEquals(expected,new Biblioteca().getBanner());
    }
}
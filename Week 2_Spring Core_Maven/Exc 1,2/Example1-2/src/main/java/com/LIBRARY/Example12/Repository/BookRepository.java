package com.LIBRARY.Example12.Repository;

import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void saveBook(String bookName) {
        System.out.println("Saving book: " + bookName);
    }
}

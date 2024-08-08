package com.LIBRARY.Example12.service;

import com.LIBRARY.Example12.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;



@Service
@SpringBootApplication
public class BookService {
    private String name;
    private int id;

    private BookRepository bookRepository;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Autowired
    private BookRepository bookRepository;

    public void management() {
        System.out.println("LibraryManagement");
        bookRepository.saveBook("Book1");
    }
}

package com.library.library.management.example1.service;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void management(){
        System.out.println("LibraryManagement");

    }
}

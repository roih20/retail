package com.example.retail.services;

import com.example.retail.domain.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> getAll();

}

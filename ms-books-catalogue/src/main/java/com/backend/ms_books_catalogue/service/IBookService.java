package com.backend.ms_books_catalogue.service;

import com.backend.ms_books_catalogue.dtos.CreateBookRequest;
import com.backend.ms_books_catalogue.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> getBooks(String title, String author, String editorial, Boolean visible);

    Book getBook(String id);

    Book createBook(CreateBookRequest book);

    Book updateBook(String id, CreateBookRequest book);

    Book partialUpdateBook(String id, String partialBook);

    Boolean removeBook(String id);
}

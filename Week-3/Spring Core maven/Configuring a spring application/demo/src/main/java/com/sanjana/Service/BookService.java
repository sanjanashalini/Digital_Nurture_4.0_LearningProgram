package com.sanjana.Service;

import com.sanjana.Repository.*;

public class BookService {
      private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("Service: Listing books");
        bookRepository.fetchBooks();
    }
}

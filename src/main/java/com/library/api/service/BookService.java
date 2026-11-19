package com.library.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.api.entity.Book;
import com.library.api.repository.BookRepository;

/*Essa anotação informa ao Spring:
Esta classe representa um componente da camada de serviço da aplicação.
Quando a aplicação inicia, o Spring realiza o processo chamado Component Scan.
*/
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
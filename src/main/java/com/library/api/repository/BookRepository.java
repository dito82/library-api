package com.library.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.api.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}


/*
 * Isso é uma das funcionalidades mais poderosas do Spring Data JPA. Estamos
 * herdando funcionalidades de JpaRepository. Sem escrever nenhuma
 * implementação, nosso Repository já possui: save(book); findById(id);
 * findAll(); deleteById(id); existsById(id); count();
 */
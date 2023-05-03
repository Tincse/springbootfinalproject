package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	public Book findBookByname(String name);

	public Book findBookByprice(int price);

}
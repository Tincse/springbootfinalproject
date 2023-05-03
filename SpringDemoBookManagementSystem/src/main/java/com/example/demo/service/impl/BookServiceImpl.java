package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Repository
public class BookServiceImpl implements BookService{
    
	
	@Autowired
	BookRepository bookrepository;
	@Override
	public Book addBook(Book book) {
		return bookrepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

}

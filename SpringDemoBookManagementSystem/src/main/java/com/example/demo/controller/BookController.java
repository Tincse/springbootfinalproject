package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	
	@PostMapping(value="/books")
	public Book addBook(@RequestBody Book book)
	{
		return bookservice.addBook(book);
	}
	@GetMapping(value="/books")
	public List<Book> getAllBooks()
	{
		return bookservice.getAllBooks();
	}

}

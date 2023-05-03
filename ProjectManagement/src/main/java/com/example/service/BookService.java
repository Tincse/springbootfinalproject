package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;

@Service
public interface BookService {
	public Book addBook(Book book);
	public Book getBookById(int id);
	public Book updateBookById(int id, Book book);
	public void deleteBookById(int id);	
	public Book findBookByName(String name);
	public Book findBookByPrice(int price);
	public List<Book> getAllBook();

}

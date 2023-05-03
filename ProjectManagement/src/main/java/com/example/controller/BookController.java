package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/book")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id){
		return bookService.getBookById(id);
	}
	@GetMapping("/book/{name}")
	public Book findBookByName(@PathVariable String name) {
		return bookService.findBookByName(name);
	}
	
	@GetMapping("/book/{price}")
	public Book findBookByPrice(@PathVariable int price) {
		return bookService.findBookByPrice(price);
	}
	@PutMapping("/book/{id}")
	public Book updateBookById(@PathVariable int id,@RequestBody Book book) {
		return bookService.updateBookById(id, book);
	}
	@DeleteMapping("/book/{id}")
	public void deleteBookById(@PathVariable int id) {
		 bookService.deleteBookById(id);
		 
	}
	

}

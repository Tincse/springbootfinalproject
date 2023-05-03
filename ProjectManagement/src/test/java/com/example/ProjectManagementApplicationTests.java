package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;

@SpringBootTest
class ProjectManagementApplicationTests {
	
	
	@Autowired
	BookService bs;
	@MockBean
	BookRepository bdao;
	

	@Test
	void testAddBook() {
		Book b1=new Book(101,"JAVAscript","James",600);
		Mockito.when(bdao.save(b1)).thenReturn(b1);
		assertEquals(b1,bs.addBook(b1));
	}
	
	@Test
	void getAll() {
		List<Book>book=Stream.of(new Book(102,"C Language","Dennis Ritchie",450),new Book(103,"HTML","Htmlauthor",350)).collect(Collectors.toList());
		Mockito.when(bdao.findAll()).thenReturn(book);
		assertEquals(2,bs.getAllBook().size());
	}

}

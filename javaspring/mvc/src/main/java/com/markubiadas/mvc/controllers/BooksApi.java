package com.markubiadas.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.markubiadas.mvc.models.Book;
import com.markubiadas.mvc.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	// Get all Books
	@RequestMapping("/api/books")
	public List<Book> index(){
		return bookService.allBooks();
	}
	
	
	// Create a book
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc,
			@RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
	
	// Update book
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String description, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
		
        Book book = new Book(title, description, lang, numOfPages);
        book.setId(id);
        
        book = bookService.updateBook(book);
        return book;
    }
	
	// Delete a book
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
    }
	
}

package com.markubiadas.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.bookclub.models.Book;
import com.markubiadas.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	// ALL BOOKS
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	// ONE DONATION
	public Book oneBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	// CREATE BOOK
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	// UPDATE BOOK
	public Book editBook(Book book) {
		return bookRepo.save(book);
	}
	
	// DELETE BOOK
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}

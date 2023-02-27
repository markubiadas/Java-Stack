package com.markubiadas.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.markubiadas.mvc.models.Book;
import com.markubiadas.mvc.services.BookService;

@Controller
public class BookController {
	
	// Dependecy Injection
	@Autowired
	BookService bookService;
	
	// Index route
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// Show all books
	@RequestMapping("/books")
	public String showAllBooks (Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
//		System.out.println(books);
		return "showall.jsp";
	}
	
	// Show one book
	@RequestMapping("/books/{bookId}")
	public String showOneBook(Model model, @PathVariable("bookId") Long bookId) {
		
//		System.out.println(bookId);
		
		Book book = bookService.findBook(bookId);
//		System.out.println(book);
		
		
		// Note ** See constructor for the value that will parse in the value="${}" to render in the jsp file.
		model.addAttribute("book", book);
		
		return "showone.jsp";
	}
	
	// ============== create a book using form =================
	
//	// Create a book form route
//	@RequestMapping("/books/new")
//	public String newBook() {
//		return "newbook.jsp";
//	}
//	
//	
//	// Create a book
//	@PostMapping("/books/create")
//	public String create(
//	    @RequestParam("title") String title,
//	    @RequestParam("description") String description,
//	    @RequestParam("language") String language,
//	    @RequestParam("pages") Integer pages) 
//	{
//	// CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	    Book book = new Book(title, description, language, pages);
//	    bookService.createBook(book);
//	    return "redirect:/books";
//	}
	
	// ============== creating a book using form with @ModelAttribute =================
	
	// Create a book form route
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "newbook.jsp";
	}
		
		
	// Create a book
	@PostMapping("/books/create")
	public String create(
		@Valid @ModelAttribute ("book") Book book,
		BindingResult result) {
		
		if(result.hasErrors()) {
			return "newbook.jsp";
		}
		
		// CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	// ============= Edit a book =================
	
	@RequestMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
	
	@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
	
	// ============= Delete a Book =================
	
	@DeleteMapping("/books/{id}")
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
	
	
	
	

}

package com.markubiadas.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.markubiadas.bookclub.models.Book;
import com.markubiadas.bookclub.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	// ===================== DASHBOARD ROUTE =========================
    
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	model.addAttribute("bookList", bookService.allBooks());
    	return "dashboard.jsp";
    }
    
    // ============= SHOW ONE BOOK ================
    @GetMapping("/books/{id}")
    public String showOneBook(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book book = bookService.oneBook(id);
    	model.addAttribute("book", book);
    	return "showOneBook.jsp";
    }
  
	
	// ============= CREATE BOOK ==================
    
    // Create Book Form
    @GetMapping("/books/new")
    public String newBookForm(@ModelAttribute("newBook") Book newBook, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	return "newBook.jsp";
    }
    
    // Process create book form
    @PostMapping("/books/new")
    public String processNewBookForm(
    		@Valid @ModelAttribute("newBook") Book newBook, BindingResult result,
    		Model model
    		) {
    	if(result.hasErrors()) {
    		return "newBook.jsp";
    	} else {
    		bookService.createBook(newBook);
    		return "redirect:/dashboard";
    	}
    }
    
    // ============= EDIT BOOK ================
    
    // Edit Book Form
    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book editBook = bookService.oneBook(id);
    	model.addAttribute("editBook", editBook);
    	return "editBook.jsp";
    }
    
    // Process edit book form
    @PutMapping("/books/edit/{id}")
    public String processEditBookForm(
    		@Valid @ModelAttribute ("editBook") Book editBook, BindingResult result, 
    		@PathVariable("id") Long id) {
    	if(result.hasErrors()) {
    		return "editBook.jsp";
    	} else {
    		bookService.editBook(editBook);
    		return "redirect:/dashboard";
    	}
    }
    
    
    // =============== DELETE BOOK =================
    
    // Delete a Book
    @DeleteMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id")Long id) {
    	bookService.deleteBook(id);
    	return "redirect:/dashboard";
    }
    
    
	
}
package com.markubiadas.savetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.markubiadas.savetravels.models.Expense;
import com.markubiadas.savetravels.services.ExpenseService;

@RestController
public class APIController {

	private final ExpenseService expenseService;
	
	public APIController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	// Get All Service
	@RequestMapping("/api/expenses")
	public List<Expense> getAllExpense(){
		return expenseService.allExpense();
	}
	
	// Create An Expense
	@PostMapping("/api/expenses")
	public Expense createExpense(
			@RequestParam("expenseName") String expenseName,
			@RequestParam("vendor") String vendor,
			@RequestParam("amount") Double amount,
			@RequestParam("description") String description
			) {
		Expense newExpense = new Expense(expenseName, vendor, amount, description);
		return expenseService.addExpense(newExpense);
		
	}
	
	// Get One Expense
	@GetMapping("/api/expenses/{id}")
	public Expense getOneExpense(@PathVariable("id") Long id) {
		return expenseService.oneExpense(id);
	}
	
	// Update An Expense
	@PutMapping("/api/expenses/{id}")
	public Expense updateExpense(
			@PathVariable("id") Long id,
			@RequestParam("expenseName") String expenseName,
			@RequestParam("vendor") String vendor,
			@RequestParam("amount") Double amount,
			@RequestParam("description") String description
			) {
		Expense foundExpense = expenseService.oneExpense(id);
		foundExpense.setExpenseName(expenseName);
		foundExpense.setVendor(vendor);
		foundExpense.setAmount(amount);
		foundExpense.setDescription(description);
		return expenseService.updateExpense(foundExpense);
	}
	
	// Delete An Expense
	@DeleteMapping("/api/expenses/{id}")
	public void deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
	}
	
	
	
}

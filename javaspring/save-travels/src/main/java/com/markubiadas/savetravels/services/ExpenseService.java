package com.markubiadas.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.savetravels.models.Expense;
import com.markubiadas.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;
	
	// Get All Expense
	public List<Expense> allExpense(){
		return expenseRepo.findAll();
	}
	
	// Create An Expense
	public Expense addExpense(Expense newExpense) {
		return expenseRepo.save(newExpense);
	}
	
	// Find One Expense
	public Expense oneExpense(Long id) {
		Optional <Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	// Update Expense
	public Expense updateExpense(Expense foundExpense) {
		return expenseRepo.save(foundExpense);
	}
	
	// Delete Expense
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	
	
}

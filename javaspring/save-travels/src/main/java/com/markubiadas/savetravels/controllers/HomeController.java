package com.markubiadas.savetravels.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.markubiadas.savetravels.models.Expense;
import com.markubiadas.savetravels.services.ExpenseService;

@Controller
public class HomeController {

	@Autowired
	private ExpenseService expenseService;
	
	// All Expense Route (Dashboard)
	@RequestMapping("/")
	public String showAllExpense(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> allExpense = expenseService.allExpense();
		model.addAttribute("expenseList", allExpense);
		return "index.jsp";
	}
	
	// Create an Expense
	@PostMapping("/expenses/create")
	public String createExpense(
		@Valid @ModelAttribute ("expense") Expense expense,
		BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			List<Expense> allExpense = expenseService.allExpense();
			model.addAttribute("expenseList", allExpense);
			return"index.jsp";
		}
		
		expenseService.addExpense(expense);
		return "redirect:/";
	}
	
	// EDIT AN EXPENSE
	
	// Edit Expense Form Route
	@RequestMapping("/expenses/edit/{id}")
	public String editExpenseForm(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.oneExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	// Edit Expense
	@PutMapping("/expenses/edit/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
	}
	
	
	// DELETE AN EXPENSE
	@DeleteMapping("/expenses/delete/{id}")
    public String deleteExpense(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/";
    }
	
	
	// SHOW ONE EXPENSE
	@GetMapping("/expenses/show/{id}")
	public String showOneExpense(Model model, @PathVariable("id") Long id) {
		Expense expense = expenseService.oneExpense(id);
		model.addAttribute("expense", expense);
		return "showone.jsp";
	}
	
}

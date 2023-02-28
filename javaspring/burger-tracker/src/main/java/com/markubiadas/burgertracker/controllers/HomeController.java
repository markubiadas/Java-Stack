package com.markubiadas.burgertracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.markubiadas.burgertracker.models.Burger;
import com.markubiadas.burgertracker.services.BurgerService;

@Controller
public class HomeController {
	
	@Autowired
	private BurgerService burgerService;
	
	// All Burger Route
	@RequestMapping("/")
	public String showAllBurgers(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> allBurger = burgerService.allBurger();
		model.addAttribute("burgerList", allBurger);
		return "index.jsp";
	}
	
	// Create a Burger
	@PostMapping("/burgers/create")
	public String create(
		@Valid @ModelAttribute ("burger") Burger burger,
		BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			// Still shows the burgers inside the table
			List<Burger> allBurger = burgerService.allBurger();
			model.addAttribute("burgerList", allBurger);
			return"index.jsp";
		}
		
		burgerService.addBurger(burger);
		return "redirect:/";
	}
	
	// Edit a Burger
	@RequestMapping("/burgers/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Burger burger = burgerService.oneBurger(id);
		model.addAttribute("burger", burger);
		return "edit.jsp";
	}
	
	@PutMapping("/burgers/{id}")
	public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
	}
	
	
}

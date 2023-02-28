package com.markubiadas.burgertracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.markubiadas.burgertracker.models.Burger;
import com.markubiadas.burgertracker.services.BurgerService;

@RestController
public class APIController {

	private final BurgerService burgerService;
	
	public APIController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	// Get All Burger
	@RequestMapping("/api/burgers")
	public List<Burger> getAllBurgers(){
		return burgerService.allBurger();
	}
	
	// Create a Burger
	@PostMapping("/api/burgers")
	public Burger createBurger(
			@RequestParam("burgerName") String burgerName,
			@RequestParam("restaurantName") String restaurantName,
			@RequestParam("rating") Integer rating,
			@RequestParam("notes") String notes
			) {
		Burger newBurger = new Burger(burgerName, restaurantName, rating, notes);
		return burgerService.addBurger(newBurger);
	}
	
	// Get one Burger
	@GetMapping("/api/burgers/{id}")
	public Burger getOneBurger(@PathVariable("id") Long id) {
		return burgerService.oneBurger(id);
	}
	
	// Update a Burger
	@PutMapping("/api/burgers/{id}")
	public Burger updateBurger(
			@PathVariable("id") Long id,
			@RequestParam("burgerName") String burgerName,
			@RequestParam("restaurantName") String restaurantName,
			@RequestParam("rating") Integer rating,
			@RequestParam("notes") String notes
			) {
		Burger foundBurger = burgerService.oneBurger(id);
		foundBurger.setBurgerName(burgerName);
		foundBurger.setRestaurantName(restaurantName);
		foundBurger.setRating(rating);
		foundBurger.setNotes(notes);
		return burgerService.updateBurger(foundBurger);
	}
	
	// Delete a Burger
	@DeleteMapping("/api/burgers/{id}")
	public void deleteBurger(@PathVariable("id") Long id) {
		burgerService.deleteBurger(id);
	}
	
	
	
	
	
	
	
	
	
	
}

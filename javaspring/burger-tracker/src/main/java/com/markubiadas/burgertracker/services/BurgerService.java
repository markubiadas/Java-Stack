package com.markubiadas.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.burgertracker.models.Burger;
import com.markubiadas.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {

	@Autowired
	private BurgerRepository burgerRepo;
	
	// Get All Burger
	public List<Burger> allBurger(){
		return burgerRepo.findAll();
	}
	
	// Create a Burger
	public Burger addBurger(Burger newBurger) {
		return burgerRepo.save(newBurger);
	}
	
	// Find one Burger
	public Burger oneBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepo.findById(id);
		if (optionalBurger.isPresent()) {
			return optionalBurger.get();
		} else {
			return null;
		}
	}
	
	
	// Update Burger
	public Burger updateBurger(Burger foundBurger) {
		return burgerRepo.save(foundBurger);
	}
	
	
	// Delete Burger
	public void deleteBurger(Long id) {
		burgerRepo.deleteById(id);
	}
	
	
	
	
	
}

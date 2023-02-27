package com.markubiadas.donationsdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.markubiadas.donationsdemo.models.Donation;
import com.markubiadas.donationsdemo.services.DonationService;

@RestController
public class APIController {

	private final DonationService donationService;
	
	public APIController(DonationService donationService) {
		this.donationService = donationService;
	}
	
	// get all donations
	@RequestMapping("/api/donations")
	public List<Donation> getAllDonations(){
		return donationService.allDonations();
	}
	
	
	// create a donation
	@PostMapping("/api/donations")
	public Donation createDonation(
			@RequestParam("donationName") String donationName,
			@RequestParam("donor") String donor,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("description") String description
			) {
		Donation newDonation = new Donation(donationName, donor, quantity, description);
		return donationService.addDonation(newDonation);
		
	}
	
	// get one donation
	@GetMapping("/api/donations/{id}")
	public Donation getOneDonation(@PathVariable("id") Long id) {
		return donationService.oneDonation(id);
	}
	
	// Update a donation -- find one and create donation
	@PutMapping("/api/donations/{id}")
	public Donation editDonationProcess(
			@PathVariable("id") Long id,
			@RequestParam("donationName") String donationName,
			@RequestParam("donor") String donor,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("description") String description
			) {
		Donation foundDonation = donationService.oneDonation(id);
		foundDonation.setDonationName(donationName);
		foundDonation.setDescription(description);
		foundDonation.setDonor(donor);
		foundDonation.setQuantity(quantity);
		return donationService.updateDonation(foundDonation);
		
	}
	
	//Delete a donation
	@DeleteMapping("/api/donations/{id}")
	public void deleteDonation(@PathVariable("id")Long id) {
		donationService.deleteDonation(id);
	}
	
	
}

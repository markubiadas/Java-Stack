package com.markubiadas.donationsdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.markubiadas.donationsdemo.models.Donation;
import com.markubiadas.donationsdemo.services.DonationService;

@Controller
public class HomeController {

	@Autowired
	private DonationService donationService;
	
	// Index Route
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// All Donations Route
	@RequestMapping("/donations")
	public String dashboardPage(Model model) {
		List<Donation> allDonations = donationService.allDonations();
		model.addAttribute("donationList", allDonations); //donationList is the one to use for jsp to render
		return "dashboard.jsp";
	}
	
	//Show One Donation Route
	@RequestMapping("/donations/{id}")
	public String oneDonation(@PathVariable("id") Long id, Model model) {
		Donation donation = donationService.oneDonation(id);
		model.addAttribute("donation", donation);
		return "showone.jsp";
	}
	
	// ======== Add Donation ==========
	
	// Display the donation form
	@GetMapping("/donations/new")
	public String newDonationForm(@ModelAttribute("newDonation") Donation donation) {
		// ModelAttribute will create an empty object based on the datatype we defined
		return "newDonation.jsp";
	}
	
	
	// Process the donation form
	@PostMapping("/donations/new")
	public String processCreateForm(
			// "newDonation" will be on the modelAttribute inside the form in the jsp file
			@Valid @ModelAttribute("newDonation") Donation donation, BindingResult result
			) {
		if(result.hasErrors()) {
			// if it does not pass the validation
			return "newDonation.jsp";
		} else {
			// it passes the validation
			donationService.addDonation(donation);
			return"redirect:/donations";
		}
	}
	
	// ========== Edit Donation ============
	
	// Display the edit form
	@GetMapping("/donations/edit/{id}")
	public String editDonationForm(@PathVariable("id") Long id, Model model) {
		Donation donation = donationService.oneDonation(id);
		// ask why "editDonation" for the line below does not work but when changed to just "donation" works
		model.addAttribute("editDonation", donation);
		return "editDonation.jsp";
	}
	
	// Process the edit form
	@PutMapping("/donations/edit/{id}")
	public String processUpdateForm(
			// ask why "editDonation" for the line below does not work but when changed to just "donation" works
			@Valid @ModelAttribute("editDonation") Donation donation,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editDonation.jsp";
		} else {
			donationService.updateDonation(donation);
			return "redirect:/donations";
		}
	}
	
	
	
}

package com.markubiadas.dojosandninjas.controllers;

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

import com.markubiadas.dojosandninjas.models.Dojo;
import com.markubiadas.dojosandninjas.models.Ninja;
import com.markubiadas.dojosandninjas.services.DojoService;
import com.markubiadas.dojosandninjas.services.NinjaService;

@Controller
public class MainController {

	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	// ========= DASHBOARD ==========
	@GetMapping("/")
	public String showAllDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> allDojo = dojoService.allDojos();
		model.addAttribute("dojoList", allDojo);
		// code below is to get all the ninjas in one dojo, to use to display how many students in one dojo.
//		model.addAttribute("ninjaList", ninjaService.allNinjas());
		return "dashboard.jsp";
	}
	
	
	// ========== CREATE DOJO ============
	
	// DISPLAY CREATE DOJO FORM
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("newDojo") Dojo newDojo) {
		return "createDojoForm.jsp";
	}
	
	
	// PROCESS CREATE DOJO FORM
	@PostMapping("/dojos/new")
	public String processDojoForm(
			@Valid @ModelAttribute ("newDojo") Dojo newDojo, BindingResult result) {
		if(result.hasErrors()) {
			return "createDojoForm.jsp";
		} else {
			dojoService.createDojo(newDojo);
			return "redirect:/";
		}
	}
	
	// ========= CREATE NINJA ===========
	
	// DISPLAY CREATE NINJA FORM
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		// displaying the list of dojos so that we can pick the dojo from the list in the dropdown menu
		List<Dojo> dojoList = dojoService.allDojos();
		model.addAttribute("dojoList", dojoList);
		return "createNinjaForm.jsp";
	}
	
	// PROCESS CREATE NINJA FORM
	@PostMapping("/ninjas/new")
	public String processNinjaForm(
			@Valid @ModelAttribute ("newNinja") Ninja newNinja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojoList = dojoService.allDojos();
			model.addAttribute("dojoList", dojoList);
			return "createNinjaForm.jsp";
		} else {
			ninjaService.createNinja(newNinja);
			return "redirect:/";
		}
	}
	
	// Show one Dojo
	@GetMapping("/dojos/show/{id}")
	public String showOneDojo(Model model, @PathVariable("id") Long id) {
		Dojo dojo = dojoService.oneDojo(id);
		model.addAttribute("dojoList", dojo); // dojoList will be the one that will be in the for loop as the item for cforEach
//		model.addAttribute("ninjaList", ninjaService.allNinjas());
		model.addAttribute("dojo", dojo); // to use the name of the dojo in the jsp file
		return "showOneDojo.jsp";
	}
	
	// SHOW ONE NINJA
	@GetMapping("/ninjas/{id}")
	public String showOneNinja(Model model, @PathVariable("id") Long id) {
		Ninja ninja = ninjaService.oneNinja(id);
		model.addAttribute("ninja", ninja);
		return "showOneNinja.jsp";
	}
	
	
	
	
}

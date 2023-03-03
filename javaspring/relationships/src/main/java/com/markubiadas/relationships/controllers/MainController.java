package com.markubiadas.relationships.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.markubiadas.relationships.models.License;
import com.markubiadas.relationships.models.Person;
import com.markubiadas.relationships.services.LicenseService;
import com.markubiadas.relationships.services.PersonService;

@Controller
public class MainController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private LicenseService licenseService;
	
	
	// ============ INDEX ROUTE ==============
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// ============= DASHBOARD ROUTE / SHOWING ALL PERSON ============
	@RequestMapping("/dashboard")
	public String showAllPerson(@ModelAttribute("person") Person person, Model model) {
		List<Person> allPerson = personService.allPerson();
		model.addAttribute("personList", allPerson);
		return "dashboard.jsp";
	}
	
	// ========== NEW PERSON FORM ===========
	@GetMapping("/persons/new")
	public String newPersonForm(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	
	// ========== ADD PERSON ============
	@PostMapping("/persons/create")
	public String createPerson(
		@Valid @ModelAttribute ("person") Person person,
		BindingResult result) {
		
		if(result.hasErrors()) {
			return "newperson.jsp";
		}
		
		personService.addPerson(person);
		return "redirect:/dashboard";
	}
	
	// ========== SHOW ONE PERSON =======================================================
	@GetMapping("/persons/show/{id}")
	public String showOnePerson(Model model, @PathVariable("id") Long id) {
		Person person = personService.onePerson(id);
		model.addAttribute("person", person);
		return "showone.jsp";
	}
	
	
	// =========== NEW LICENSE FORM ===============
	@GetMapping("/licenses/new")
	public String newLicenseForm(@ModelAttribute("license") License license, Model model) {
		List<Person> allPerson = personService.allPerson();
		model.addAttribute("personList", allPerson);
		return "newlicense.jsp";
	}
	
	// ============= ADD LICENSE ================
	@PostMapping("/licenses/create")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "newlicense.jsp";
		}
		
		licenseService.addLicense(license);
		return "redirect:/dashboard";
	}
	
	
	

}

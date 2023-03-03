//package com.markubiadas.relationships.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.markubiadas.relationships.models.Person;
//import com.markubiadas.relationships.services.LicenseService;
//import com.markubiadas.relationships.services.PersonService;
//
//@RestController
//public class APIController {
//
//	@Autowired
//	private PersonService personService;
//	
//	@Autowired
//	private LicenseService licenseService;
//	
//	
//	// ============= PERSON SECTION =====================
//	
//	// Get all Person
//	@RequestMapping("/api/persons")
//	public List<Person> getAllPerson(){
//		return personService.allPerson();
//	}
//	
//	// Create a Person
//	@RequestMapping("/api/persons")
//	public Person createPerson(
//			@RequestParam("firstName") String firstName,
//			@RequestParam("lastName") String lastName
//			) {
//		Person newPerson = new Person(firstName, lastName);
//		return personService.addPerson(newPerson);
//	}
//	
//	// Get one Person
//	@GetMapping("/api/persons/{id}")
//	public Person getOnePerson(@PathVariable("id") Long id) {
//		return personService.onePerson(id);
//	}
//	
//	
//	// ============= LICENSE SECTION ====================
//	
//	
//	
//	
//	
//}

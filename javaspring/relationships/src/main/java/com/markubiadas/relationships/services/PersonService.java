package com.markubiadas.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.relationships.models.Person;
import com.markubiadas.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	// Get all Person
	public List<Person> allPerson(){
		return personRepo.findAll();
	}
	
	// Create a Person
	public Person addPerson(Person newPerson) {
		return personRepo.save(newPerson);
	}
	
	// Find one Person
	public Person onePerson(Long id) {
		Optional<Person> optionalPerson = personRepo.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}

}

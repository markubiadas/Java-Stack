package com.markubiadas.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.dojosandninjas.models.Dojo;
import com.markubiadas.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;
	
	// GET ALL DOJO
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	
	// CREATE DOJO
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	
	// FIND ONE DOJO
	public Dojo oneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
}

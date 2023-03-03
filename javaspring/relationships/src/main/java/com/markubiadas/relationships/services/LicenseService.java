package com.markubiadas.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markubiadas.relationships.models.License;
import com.markubiadas.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository licenseRepo;
	
	// Get all License
	public List<License> allLicense(){
		return licenseRepo.findAll();
	}
	
	// Create a License
	public License addLicense(License newLicense) {
		return licenseRepo.save(newLicense);
	}
	
	// Find one License
	public License oneLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
}

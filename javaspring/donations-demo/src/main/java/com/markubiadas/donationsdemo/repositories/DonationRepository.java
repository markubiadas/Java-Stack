package com.markubiadas.donationsdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markubiadas.donationsdemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {
	// CrudRepository -- save(), deleteById().... no need to specify
	List<Donation> findAll();
}

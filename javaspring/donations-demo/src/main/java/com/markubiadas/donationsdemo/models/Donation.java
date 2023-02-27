package com.markubiadas.donationsdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="donations") // the MySQL table name
public class Donation {

	// 1. Attributes
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
    @Size(min = 2, max = 200, message="Donation name must be at least 2 characters.")
    private String donationName;
	
	@NotNull
    @Size(min = 2, max = 200, message="Donor name must be at least 2 characters.")
    private String donor;
	
	@NotNull(message="Quantity must not be blank.")
	@Min(value = 0, message = "Quantity must be positive")
    private Integer quantity;
	
	@NotNull
    @Size(min = 2, max = 200, message="Description must be at least 2 characters.")
    private String description;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	// 2. Constructors
    
    public Donation() {}
    
    
	public Donation(String donationName, String donor, Integer quantity, String description) {
		this.donationName = donationName;
		this.donor = donor;
		this.quantity = quantity;
		this.description = description;
	}

	// 3. Getters and Setters
	
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDonationName() {
		return donationName;
	}


	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}


	public String getDonor() {
		return donor;
	}


	public void setDonor(String donor) {
		this.donor = donor;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}

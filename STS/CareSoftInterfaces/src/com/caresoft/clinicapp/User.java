package com.caresoft.clinicapp;

public class User {
	
	// Attributes
    protected Integer id;
    protected int pin;
	
    
	// Constructor - Implement a constructor that takes an ID
	public User(Integer id) {
		this.id = id;
//		this.pin = pin;
	}
	
	// TO DO: Getters and setters
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}

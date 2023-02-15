package com.markubiadas.zookeeper;

public class Gorilla extends Mammal{
	

	
	
	// Constructor
	public Gorilla() {
		super();
	}
	
	
	// Methods
	// 1. Throw
	public void throwThings() {
		System.out.println("Gorilla throws a thing.");
		this.setEnergyLevel(-5);
		this.displayEnergyLevel();
	}
	
	// 2. Eat Bananas
	public void eatBananas() {
		System.out.println("Gorilla eats bananas.");
		this.setEnergyLevel(10);
		this.displayEnergyLevel();
	}
	
	// 3. Climb
	public void climb() {
		System.out.println("Gorilla climbs up.");
		this.setEnergyLevel(-10);
		this.displayEnergyLevel();
	}
	
	
	
	
	
	
	
	//	Display Energy
//	public int displayEnergyLevel() {
//		super.displayEnergyLevel();
//		return energyLevel;
//	}
}

package com.markubiadas.zookeeper;

public class Mammal {

	// Attributes
	private int energyLevel;
	
	
	
	
	//	Constructor
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	//	Methods
	//Display Energy
	public int displayEnergyLevel(){
		System.out.println("Energy level is: " + energyLevel);
		return energyLevel;
	}
	
	

	//	Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
	
}

package com.markubiadas.zookeeper;

public class Bat extends Mammal {

//	public int energyLevel = 300;
	
	//Constructor
	public Bat() {
		super();
		this.setEnergyLevel(200);
	}
	
	// Methods
	// 1. Fly
	public void fly() {
		System.out.println("The bat is flying. Wooooooshhhh!");
		this.setEnergyLevel(-50);
		displayEnergyLevel();
	}
	
	// 2. Eat Human
	public void eatHuman() {
		System.out.println("The bat is eating a...... well...nevermind.");
		this.setEnergyLevel(25);
		displayEnergyLevel();
	}
	
	//3. Attack a Town
	public void attackTown() {
		System.out.println("The bat is attack the town. AHHHHHHHHH!");
		this.setEnergyLevel(-100);
		displayEnergyLevel();
	}
	
	
	
	
	// Display Energy
//	public int displayEnergyLevel() {
//		System.out.println("Bat Energy Level is: " + energyLevel + "/300");
//		return energyLevel;
//	}
	
//	public int displayEnergyLevel() {
//		energyLevel = energyLevel + 200;
//		super.displayEnergyLevel();
//		return energyLevel;
//	}
//	
}

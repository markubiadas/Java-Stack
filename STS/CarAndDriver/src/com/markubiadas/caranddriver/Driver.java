package com.markubiadas.caranddriver;

public class Driver extends Car {
	//Attributes
	public void drive() {
		System.out.println("You drive the car.");
		if (gas != 0) {
			gas = gas - 1;
			gasLevel();
		} else {
			System.out.println("Game Over");
			gasLevel();
		}
		
	}
	
	public void useBoosters() {
		System.out.println("You use the boosters.");
		if (gas != 0) {
			gas = gas - 3;
			gasLevel();
		} else {
			System.out.println("Game Over");
			gasLevel();
		}
	}
	
	public void refuel() {
		System.out.println("You refuel the car.");
		gas = gas + 2;
		gasLevel();
	}
	
	//Constructor
	
	
	//Getters and Setters
}

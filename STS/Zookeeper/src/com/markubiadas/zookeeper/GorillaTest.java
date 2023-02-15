package com.markubiadas.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammal mammal1 = new Mammal();
		System.out.println("------- Mammal Energy Test -------");
		mammal1.displayEnergyLevel();

		
		
		Gorilla gorilla1 = new Gorilla();
		System.out.println("------- Gorilla Test ------");
		gorilla1.displayEnergyLevel();
		gorilla1.throwThings();
		gorilla1.throwThings();
		gorilla1.throwThings();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		
	}

}

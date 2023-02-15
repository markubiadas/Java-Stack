package com.markubiadas.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bat bat1 = new Bat();
		
		System.out.println("------ Bat Test ------");
		bat1.displayEnergyLevel();
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.eatHuman();
		bat1.eatHuman();
		
		bat1.fly();
		

		
	}

}

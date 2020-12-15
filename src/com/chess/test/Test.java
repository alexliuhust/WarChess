package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.model.Arm;
import com.chess.model.Spearman;
import com.chess.model.Swordsman;
import com.chess.model.User;


public class Test {
	
	public static void swordsman_spearman() {
		Arm swordsman = new Swordsman("sw1");
		Arm spearman = new Spearman("sp1");
		
		Calculate.mainAttack(swordsman, spearman);
		Calculate.mainAttack(spearman, swordsman);
		Calculate.mainAttack(swordsman, spearman);
		Calculate.mainAttack(spearman, swordsman);
		Calculate.mainAttack(swordsman, spearman);
	}
	
	public static void printUser() {
		User alex = new User("Alex");
		alex.troop.put("sw1", new Swordsman("sw1"));
		alex.troop.put("sw2", new Swordsman("sw2"));
		alex.troop.put("sp1", new Spearman("sp1"));
		alex.getInfo();
	}
	
	
	
	

	public static void main(String[] args) {
		swordsman_spearman();
		//printUser();

	}

}

package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.data.*;
import com.chess.model.*;


public class Test {
	
	
	
	public static void swords_assassin(int round) {
		Arm swords = new Swordsman("sw");
		Arm assa = new Assassin("ass");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(assa, swords);
			Calculate.mainAttack(swords, assa);
		}
	}
	
	public static void spear_assassin(int round) {
		Arm spear = new Spearman("sp");
		Arm assa = new Assassin("ass");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(assa, spear);
			Calculate.mainAttack(spear, assa);
		}
	}
	
	public static void shock_assassin(int round) {
		Arm shock = new ShockCavalry("sh");
		Arm assa = new Assassin("ass");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(assa, shock);
			Calculate.mainAttack(shock, assa);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		swords_assassin(10);
	}
	

}

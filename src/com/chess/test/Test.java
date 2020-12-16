package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.model.*;


public class Test {
	
	public static void knight_spear(int round) {
		Arm knight = new Knight("kn");
		Arm spearman = new Spearman("sp");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(spearman, knight);
			Calculate.mainAttack(knight, spearman);
			
		}
	}
	
	public static void knight_swords(int round) {
		Arm knight = new Knight("kn");
		Arm swords = new Swordsman("sw");
		for (int i = 0; i < round; i++) {
			
			Calculate.mainAttack(knight, swords);
			Calculate.mainAttack(swords, knight);
		}
	}
	
	public static void long_knight(int round) {
		Arm knight = new Knight("kn");
		Arm lo = new Longbowman("lo");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(lo, knight);
		}
	}
	
	public static void archer_knight(int round) {
		Arm knight = new Knight("kn");
		Arm archer = new Archer("ar");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(archer, knight);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		archer_knight(10);
	}
	

}

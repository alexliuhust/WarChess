package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.model.Archer;
import com.chess.model.Arm;
import com.chess.model.Longbowman;
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
	
	public static void archer_spearman() {
		Arm archer = new Archer("ar");
		Arm spearman = new Spearman("sp");
		
		Calculate.mainAttack(archer, spearman);
		Calculate.mainAttack(archer, spearman);
	}
	
	public static void long_swordsman() {
		Arm swordsman = new Swordsman("sw1");
		Arm longbowman = new Longbowman("lo1");
		
		Calculate.mainAttack(longbowman, swordsman);
		Calculate.mainAttack(longbowman, swordsman);
	}
	
	public static void long_spear_archer_spear() {
		Arm archer = new Archer("ar");
		Arm longbowman = new Longbowman("lo");
		Arm spearman1 = new Spearman("sp_v");
		Arm spearman2 = new Spearman("sp_v");
		
		Calculate.mainAttack(archer, spearman1);
		Calculate.mainAttack(longbowman, spearman2);
	}
	
	public static void long_archer_archer_archer() {
		Arm archer = new Archer("ar");
		Arm longbowman = new Longbowman("lo");
		Arm archer_1 = new Archer("ar_v");
		Arm archer_2 = new Archer("ar_v");
		
		Calculate.mainAttack(archer, archer_1);
		Calculate.mainAttack(longbowman, archer_2);
	}
	
	
	public static void printUser() {
		User alex = new User("Alex");
		alex.troop.put("sw1", new Swordsman("sw1"));
		alex.troop.put("sw2", new Swordsman("sw2"));
		alex.troop.put("sp1", new Spearman("sp1"));
		alex.getInfo();
	}
	
	
	
	
	

	public static void main(String[] args) {
		archer_spearman();
	}

}

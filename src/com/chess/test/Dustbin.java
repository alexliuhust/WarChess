package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.data.Archer;
import com.chess.data.Longbowman;
import com.chess.data.RangeRider;
import com.chess.data.ShockCavalry;
import com.chess.data.Spearman;
import com.chess.data.Swordsman;
import com.chess.model.Arm;
import com.chess.model.User;

public class Dustbin {
	public static void swordsman_spearman() {
		Arm swordsman = new Swordsman("sw1");
		Arm spearman = new Spearman("sp1");
		
		Calculate.mainAttack(swordsman, spearman);
		Calculate.mainAttack(spearman, swordsman);
		Calculate.mainAttack(swordsman, spearman);
		Calculate.mainAttack(spearman, swordsman);
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
	
	public static void swordsman_swordsman() {
		Arm swordsman1 = new Swordsman("sw1");
		Arm swordsman2 = new Swordsman("sw2");
		
		Calculate.mainAttack(swordsman1, swordsman2);
		Calculate.mainAttack(swordsman2, swordsman1);
		Calculate.mainAttack(swordsman1, swordsman2);
		Calculate.mainAttack(swordsman2, swordsman1);
		Calculate.mainAttack(swordsman1, swordsman2);
	}
	
	public static void rangeRider_swordsman(int round) {
		Arm range = new RangeRider("rar");
		Arm swordsman = new Swordsman("sw");
		for (int i = 0; i < round; i++) {
			
			Calculate.mainAttack(range, swordsman);
			Calculate.mainAttack(swordsman, range);
		}
	}
	
	public static void spearman_rangeRider(int round) {
		Arm range = new RangeRider("rar");
		Arm spearman = new Spearman("sp");
		for (int i = 0; i < round; i++) {
			
			Calculate.mainAttack(range, spearman);
			Calculate.mainAttack(spearman, range);
		}
	}
	
	public static void archer_rangeRider_long_rangeRider() {
		Arm archer = new Archer("ar");
		Arm longbowman = new Longbowman("lo");
		Arm range1 = new RangeRider("rar_v");
		Arm range2 = new RangeRider("rar_v");
		Calculate.mainAttack(archer, range1);
		Calculate.mainAttack(longbowman, range2);
	}
	
	public static void shock_swords(int round) {
		Arm shock = new ShockCavalry("ca");
		Arm swordsman = new Swordsman("sw");
		for (int i = 0; i < round; i++) {
			Calculate.mainAttack(swordsman, shock);
			Calculate.mainAttack(shock, swordsman);
		}
	}
	
	public static void printUser() {
		User alex = new User("Alex");
		alex.troop.put("sw1", new Swordsman("sw1"));
		alex.troop.put("sw2", new Swordsman("sw2"));
		alex.troop.put("sp1", new Spearman("sp1"));
		alex.getInfo();
	}

}

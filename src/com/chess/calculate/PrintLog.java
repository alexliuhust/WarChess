package com.chess.calculate;

import com.chess.model.Arm;

public class PrintLog {

	public static void beforeLog(Arm attacker, Arm defender) {
		System.out.println("=======================================================");
		System.out.println("\t\t" + attacker.alias + " attacking " + defender.alias + "\n");
		System.out.println(attacker.alias + " current:" + "\t" + attacker.showCurrentScale());
		System.out.println(defender.alias + " current:" + "\t" + defender.showCurrentScale());
	}
	
	public static void attackLog(Arm defender,
								 int total_damage, int left_armor, 
								 int real_damage, int defender_dead) {
		
		System.out.println("Main: total:" + total_damage + " armorleft:" + left_armor + 
				" real:" + real_damage + " " + defender.alias + " dead:" + defender_dead);
	}
	
	public static void counterLog(Arm attacker, 
								  int total_damage, int left_armor, 
								  int real_damage, int dead) {
		
		System.out.println("Coun: total:" + total_damage + " armorleft:" + left_armor + 
				" real:" + real_damage + " " + attacker.alias + " dead:" + dead);
	}
	
	public static void afterLog(Arm attacker, Arm defender) {
		System.out.println(attacker.alias + " left: " + "\t" + attacker.showCurrentScale());
		System.out.println(defender.alias + " left: " + "\t" + defender.showCurrentScale());
		System.out.println("=======================================================");
	}
}

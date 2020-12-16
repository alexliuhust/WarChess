package com.chess.calculate;

import com.chess.model.Arm;

public class Calculate {

	/**
	 * Main Attack. Calculate how many units the defender will have left
	 * @param attacker
	 * @param defender
	 */
	public static void mainAttack(Arm attacker, Arm defender) {
		if (attacker.cur_scale == 0 || defender.cur_scale == 0) 
			return;
		
		System.out.println("=======================================================");
		System.out.println("\t\t" + attacker.alias + " attacking " + defender.alias + "\n");
		System.out.println(attacker.alias + " current:" + attacker.cur_scale);
		System.out.println(defender.alias + " current:" + defender.cur_scale);
		
		int attacker_dead = 0, defender_dead = 0;
		int total_damage = attacker.dama * attacker.cur_scale;
		
		// Calculate how much the defender's armor can do
		int left_armor = calculateLeftArmor(attacker, defender);
		
		// Calculate how many units will die in the defender's arm
		int real_damage = total_damage * (100 - left_armor) / 100;
		int dead = real_damage / defender.uhp;
		if (dead == 0) dead = 1;
		
		defender_dead = dead;
		System.out.println("Main: total:" + total_damage + " armorleft:" + left_armor + 
				" real:" + real_damage + " " + defender.alias + " dead:" + defender_dead);
		
		// Determine whether there is a counter attack
		if (attacker.type.equals("me")) {
			attacker_dead = defenceAttack(attacker, defender);
		}
		
		// Update attacker's and defender's current scales
		attacker.cur_scale -= attacker_dead;
		defender.cur_scale -= defender_dead;
		if (attacker.cur_scale < 0) attacker.cur_scale = 0;
		if (defender.cur_scale < 0) defender.cur_scale = 0;
		
		System.out.println(attacker.alias + " left: " + attacker.cur_scale);
		System.out.println(defender.alias + " left: " + defender.cur_scale);
		System.out.println("=======================================================");
	}
	
	/**
	 * Defense Attack. Calculate how many units the attacker will have left
	 * @param attacker
	 * @param defender
	 */
	private static int defenceAttack(Arm attacker, Arm defender) {
		if (attacker.cur_scale == 0 || defender.cur_scale == 0) 
			return 0;
		
		int total_damage = defender.d_dama * defender.cur_scale;
		
		// Calculate how much the attacker's armor can do
		int left_armor = attacker.me_arm - defender.d_ap;
		if (left_armor < 0) left_armor = 0;
		
		// Calculate how many units will die in the attacker's arm
		int real_damage = total_damage * (100 - left_armor) / 100;
		int dead = real_damage / attacker.uhp;
		if (dead == 0) dead = 1;
		
		System.out.println("Coun: total:" + total_damage + " armorleft:" + left_armor + 
				" real:" + real_damage + " " + attacker.alias + " dead:" + dead);
		
		return dead;
	}
	
	/**
	 * Calculate how much the defender's armor can do
	 * @param attacker
	 * @param defender
	 * @return
	 */
	private static int calculateLeftArmor(Arm attacker, Arm defender) {
		int left_armor = 0;
		if (attacker.type.equals("me")) 
			left_armor = defender.me_arm - attacker.ap;
		else if (attacker.type.equals("ra"))
			left_armor = defender.ra_arm - attacker.ap;
		else 
			left_armor = defender.ch_arm - attacker.ap;
		
		if (left_armor < 0) left_armor /= 5;
		
		return left_armor;
	}
}


























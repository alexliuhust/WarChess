package com.chess.calculate;

import com.chess.model.Arm;

public class Calculate {

	/**
	 * Main Attack. Calculate how many units the defender will have left
	 * @param attacker
	 * @param defender
	 */
	public static void mainAttack(Arm attacker, Arm defender) {
		if (attacker.cur_scale == 0 || defender.cur_scale == 0 || attacker.ammo == 0) 
			return;
		
		PrintLog.beforeLog(attacker, defender);
		
		int attacker_dead = 0, defender_dead = 0;
		int total_damage = CalculateHelper.calculateTotalDamage(attacker, defender);
		
		// Calculate how much the defender's armor can do
		int left_armor = CalculateHelper.calculateLeftArmor(attacker, defender);
		
		// Calculate how many units will die in the defender's arm
		int real_damage = total_damage * (100 - left_armor) / 100;
		int dead = real_damage / defender.uhp;
		if (dead == 0) dead = 1;
		
		defender_dead = dead;
		PrintLog.attackLog(defender, total_damage, left_armor, real_damage, defender_dead);
		
		// Determine whether there is a counter attack
		if (attacker.type.equals("me")) {
			attacker_dead = CalculateHelper.defenceAttack(attacker, defender);
		}
		
		// Update attacker's and defender's current scales and attacker's ammo
		CalculateHelper.updateCurrentScale(attacker, defender, attacker_dead, defender_dead);
		
		PrintLog.afterLog(attacker, defender);
	}
}

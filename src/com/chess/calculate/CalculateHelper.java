package com.chess.calculate;

import com.chess.model.Arm;

public class CalculateHelper {

	/**
	 * Defense Attack. Calculate how many units the attacker will have left
	 * @param attacker
	 * @param defender
	 */
	public static int defenceAttack(Arm attacker, Arm defender) {
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
		
		PrintLog.counterLog(attacker, total_damage, left_armor, real_damage, dead);
		return dead;
	}
	
	/**
	 * Calculate how much the defender's armor can do
	 * @param attacker
	 * @param defender
	 * @return
	 */
	public static int calculateLeftArmor(Arm attacker, Arm defender) {
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
	
	/**
	 * Calculate the Total Damage
	 * The damage of each class has a specific degree of instability
	 * @param attacker
	 * @param defender
	 * @return
	 */
	public static int calculateTotalDamage(Arm attacker, Arm defender) {
		int total_damage = attacker.dama * attacker.cur_scale;
		int step = 0;
		int rand = 0;
		
		if (attacker.categ.equals("cav")) {
			if ((defender.cur_scale + 0.0) / (defender.scale + 0.0) < 0.3) {
				total_damage += total_damage / 6;
			}
			step = total_damage / 13;
			rand = (int)(Math.random() * 1.7 * step) - step;
		}
		else if (attacker.categ.equals("art")) {
			if ((defender.cur_scale + 0.0) / (defender.scale + 0.0) < 0.1) {
				total_damage /= 10;
			}else if ((defender.cur_scale + 0.0) / (defender.scale + 0.0) < 0.3) {
				total_damage -= total_damage / 4;
			}else if ((defender.cur_scale + 0.0) / (defender.scale + 0.0) < 0.6) {
				total_damage -= total_damage / 2;
			}
			step = total_damage / 5;
			rand = (int)(Math.random() * 1.2 * step) - step;
		}
		
		return total_damage + rand;
	}
	
	/**
	 * Update attacker's and defender's current scales
	 * @param attacker
	 * @param defender
	 */
	public static void updateCurrentScale(Arm attacker, Arm defender, int attacker_dead, int defender_dead) {
		attacker.cur_scale -= attacker_dead;
		defender.cur_scale -= defender_dead;
		if (attacker.cur_scale < 0) attacker.cur_scale = 0;
		if (defender.cur_scale < 0) defender.cur_scale = 0;
	}
}

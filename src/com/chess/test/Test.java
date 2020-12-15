package com.chess.test;

import com.chess.calculate.Calculate;
import com.chess.model.Arm;


public class Test {
	
	public static void swordsman_spearman() {
		Arm swordsman = new Arm();
		swordsman.name = "swordsman1";
		swordsman.cur_scale = 100;
		swordsman.uhp = 50;
		swordsman.me_arm = 50;
		swordsman.dama = 20;
		swordsman.ap = 10;
		swordsman.type = "me";
		swordsman.d_dama = 20;
		swordsman.d_ap = 10;
		
		Arm spearman = new Arm();
		spearman.name = "spearman1";
		spearman.cur_scale = 80;
		spearman.uhp = 45;
		spearman.me_arm = 50;
		spearman.dama = 16;
		spearman.ap = 30;
		spearman.type = "me";
		spearman.d_dama = 16;
		spearman.d_ap = 30;
		
		
		Calculate.mainAttack(swordsman, spearman);
		Calculate.mainAttack(spearman, swordsman);
		Calculate.mainAttack(swordsman, spearman);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		swordsman_spearman();

	}

}

























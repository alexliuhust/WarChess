package com.chess.data;

import com.chess.model.Arm;

public class ShockCavalry extends Arm {

	public ShockCavalry() {
		name = "Shock Cavalry";
		categ = "cav";
		
		cost = 380;
		scale = 30;
		cur_scale = 30;   
		uhp = 130;
		ga = "g";
		speed = 7;
		
		me_arm = 40;
		ra_arm = 20;
		ch_arm = 80;
		
		dama = 70;
		ap = 50;
		type = "ch";
		range = 0;
		
		d_dama = 11;
		d_ap = 30;
	}
}

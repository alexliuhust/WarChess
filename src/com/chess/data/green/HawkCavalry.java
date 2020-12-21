package com.chess.data.green;

import com.chess.model.Arm;

public class HawkCavalry extends Arm {

	public HawkCavalry() {
		name = "Hawk Cavalry";
		categ = "cav";
		
		cost = 220;
		scale = 20;
		cur_scale = 20;   
		uhp = 130;
		ga = "a";
		speed = 8;
		
		me_arm = 30;
		ra_arm = 80;
		ch_arm = 50;
		
		dama = 37;
		ap = 35;
		type = "ra";
		range = 6;
		ammo = 30;
		
		d_dama = 20;
		d_ap = 25;
	}
}

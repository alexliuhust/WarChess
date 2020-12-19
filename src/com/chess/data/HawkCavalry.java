package com.chess.data;

import com.chess.model.Arm;

public class HawkCavalry extends Arm {

	public HawkCavalry() {
		name = "Hawk Cavalry";
		categ = "cav";
		
		cost = 370;
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

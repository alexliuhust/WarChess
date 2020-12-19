package com.chess.data.coral;

import com.chess.model.Arm;

public class MarinesShield extends Arm {

	public MarinesShield() {
		name = "Marines-Shield";
		categ = "inf";
		
		cost = 240;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 4;
		
		me_arm = 60;
		ra_arm = 50;
		ch_arm = 80;
		
		dama = 30;
		ap = 20;
		type = "ra";
		range = 6;
		ammo = 30;
		
		d_dama = 14;
		d_ap = 35;
	}
}

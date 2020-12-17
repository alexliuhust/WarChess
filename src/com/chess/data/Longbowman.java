package com.chess.data;

import com.chess.model.Arm;

public class Longbowman extends Arm {

	public Longbowman() {
		name = "Longbowman";
		categ = "inf";
		
		cost = 230;
		scale = 40;
		cur_scale = 40;   
		uhp = 50;
		ga = "g";
		speed = 3;
		
		me_arm = 0;
		ra_arm = 0;
		ch_arm = 0;
		
		dama = 38;
		ap = 50;
		type = "ra";
		range = 7;
		ammo = 10;
		
		d_dama = 8;
		d_ap = 0;
	}
}

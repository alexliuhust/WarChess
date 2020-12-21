package com.chess.data.coral;

import com.chess.model.Arm;

public class MarinesLight extends Arm {

	public MarinesLight() {
		name = "Marines-Light";
		categ = "inf";
		
		cost = 180;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 5;
		
		me_arm = 10;
		ra_arm = 10;
		ch_arm = 75;
		
		dama = 30;
		ap = 20;
		type = "ra";
		range = 6;
		ammo = 25;
		
		d_dama = 14;
		d_ap = 35;
	}
}

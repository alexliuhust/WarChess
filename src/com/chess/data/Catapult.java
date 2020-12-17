package com.chess.data;

import com.chess.model.Arm;

public class Catapult extends Arm {

	public Catapult() {
		name = "Catapult";
		categ = "art";
		
		cost = 400;
		scale = 20;
		cur_scale = 20;   
		uhp = 50;
		ga = "g";
		speed = 2;
		
		me_arm = 40;
		ra_arm = 40;
		ch_arm = 40;
		
		dama = 190;
		ap = 0;
		type = "ra";
		range = 10;
		ammo = 8;
		
		d_dama = 0;
		d_ap = 0;
	}
}

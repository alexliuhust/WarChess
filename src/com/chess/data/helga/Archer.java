package com.chess.data.helga;

import com.chess.model.Arm;

public class Archer extends Arm {
	
	public Archer() {
		name = "Archer";
		categ = "inf";
		
		cost = 210;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 4;
		
		me_arm = 0;
		ra_arm = 0;
		ch_arm = 0;
		
		dama = 30;
		ap = 0;
		type = "ra";
		range = 6;
		ammo = 30;
		
		d_dama = 8;
		d_ap = 0;
	}

}

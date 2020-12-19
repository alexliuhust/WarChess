package com.chess.data.green;

import com.chess.model.Arm;

public class Hunter extends Arm {
	
	public Hunter() {
		name = "Hunter";
		categ = "inf";
		
		cost = 260;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 5;
		
		me_arm = 0;
		ra_arm = 30;
		ch_arm = 0;
		
		dama = 42;
		ap = 35;
		type = "ra";
		range = 7;
		ammo = 35;
		
		d_dama = 10;
		d_ap = 10;
	}

}

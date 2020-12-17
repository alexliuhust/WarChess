package com.chess.data;

import com.chess.model.Arm;

public class TempleGuard extends Arm {

	public TempleGuard() {
		name = "*Temple Guard";
		categ = "cav";
		
		cost = 380;
		scale = 30;
		cur_scale = 30;   
		uhp = 160;
		ga = "g";
		speed = 7;
		
		me_arm = 90;
		ra_arm = 90;
		ch_arm = 90;
		
		dama = 50;
		ap = 30;
		type = "me";
		range = 0;
		
		d_dama = 45;
		d_ap = 30;
	}
}

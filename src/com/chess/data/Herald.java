package com.chess.data;

import com.chess.model.Arm;

public class Herald extends Arm {

	public Herald() {
		name = "Herald";
		categ = "cav";
		
		cost = 350;
		scale = 30;
		cur_scale = 30;   
		uhp = 130;
		ga = "g";
		speed = 7;
		
		me_arm = 40;
		ra_arm = 40;
		ch_arm = 50;
		
		dama = 38;
		ap = 50;
		type = "me";
		range = 0;
		
		d_dama = 32;
		d_ap = 50;
	}
}

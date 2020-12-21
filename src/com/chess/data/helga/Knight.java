package com.chess.data.helga;

import com.chess.model.Arm;

public class Knight extends Arm {

	public Knight() {
		name = "Knight";
		categ = "cav";
		
		cost = 150;
		scale = 30;
		cur_scale = 30;   
		uhp = 150;
		ga = "g";
		speed = 6;
		
		me_arm = 80;
		ra_arm = 80;
		ch_arm = 80;
		
		dama = 50;
		ap = 10;
		type = "me";
		range = 0;
		
		d_dama = 48;
		d_ap = 10;
	}
}

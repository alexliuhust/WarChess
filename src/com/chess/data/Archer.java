package com.chess.data;

import com.chess.model.Arm;

public class Archer extends Arm {
	
	public Archer(String alias_) {
		name = "Archer";
		alias = alias_;
		cost = 180;
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
		
		d_dama = 8;
		d_ap = 0;
	}

}

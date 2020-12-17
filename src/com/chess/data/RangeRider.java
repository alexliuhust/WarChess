package com.chess.data;

import com.chess.model.Arm;

public class RangeRider extends Arm {

	public RangeRider() {
		name = "RangeRider";
		categ = "cav";
		
		cost = 320;
		scale = 30;
		cur_scale = 30;   
		uhp = 100;
		ga = "g";
		speed = 8;
		
		me_arm = 0;
		ra_arm = 80;
		ch_arm = 30;
		
		dama = 30;
		ap = 0;
		type = "ra";
		range = 6;
		ammo = 15;
		
		d_dama = 10;
		d_ap = 0;
	}
}

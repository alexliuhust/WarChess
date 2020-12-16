package com.chess.data;

import com.chess.model.Arm;

public class RangeRider extends Arm {

	public RangeRider(String alias_) {
		name = "RangeRider";
		alias = alias_;
		cost = 250;
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
		
		d_dama = 10;
		d_ap = 0;
	}
}

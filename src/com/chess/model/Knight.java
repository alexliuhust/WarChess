package com.chess.model;

public class Knight extends Arm {

	public Knight(String alias_) {
		name = "Knight";
		alias = alias_;
		cost = 300;
		scale = 30;
		cur_scale = 30;   
		uhp = 130;
		ga = "g";
		speed = 5;
		
		me_arm = 100;
		ra_arm = 80;
		ch_arm = 80;
		
		dama = 40;
		ap = 10;
		type = "me";
		range = 0;
		
		d_dama = 36;
		d_ap = 10;
	}
}

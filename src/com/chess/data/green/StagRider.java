package com.chess.data.green;

import com.chess.model.Arm;

public class StagRider extends Arm {

	public StagRider() {
		name = "Stag Rider";
		categ = "cav";
		
		cost = 370;
		scale = 30;
		cur_scale = 30;   
		uhp = 120;
		ga = "g";
		speed = 8;
		
		me_arm = 20;
		ra_arm = 80;
		ch_arm = 30;
		
		dama = 37;
		ap = 35;
		type = "ra";
		range = 6;
		ammo = 25;
		
		d_dama = 60;
		d_ap = 50;
	}
}

package com.chess.data.green;

import com.chess.model.Arm;

public class PiercingHunter extends Arm {
	
	public PiercingHunter() {
		name = "Piercing Hunter";
		categ = "inf";
		
		cost = 270;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 5;
		
		me_arm = 0;
		ra_arm = 30;
		ch_arm = 0;
		
		dama = 39;
		ap = 60;
		type = "ra";
		range = 7;
		ammo = 30;
		
		d_dama = 10;
		d_ap = 10;
	}

}

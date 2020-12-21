package com.chess.data.green;

import com.chess.model.Arm;

public class Watcher extends Arm {

	public Watcher() {
		name = "Watcher";
		categ = "inf";
		
		cost = 180;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 5;
		
		me_arm = 30;
		ra_arm = 30;
		ch_arm = 30;
		
		dama = 30;
		ap = 0;
		type = "ra";
		range = 6;
		ammo = 26;
		
		d_dama = 25;
		d_ap = 25;
	}
}

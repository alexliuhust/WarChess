package com.chess.data;

import com.chess.model.Arm;

public class Watcher extends Arm {

	public Watcher() {
		name = "*Watcher";
		categ = "inf";
		
		cost = 260;
		scale = 60;
		cur_scale = 60;   
		uhp = 50;
		ga = "g";
		speed = 5;
		
		me_arm = 30;
		ra_arm = 30;
		ch_arm = 30;
		
		dama = 37;
		ap = 35;
		type = "ra";
		range = 6;
		ammo = 20;
		
		d_dama = 15;
		d_ap = 20;
	}
}

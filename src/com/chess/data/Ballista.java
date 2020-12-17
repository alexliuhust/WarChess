package com.chess.data;

import com.chess.model.Arm;

public class Ballista extends Arm {

	public Ballista() {
		name = "Ballista";
		categ = "art";
		
		cost = 370;
		scale = 20;
		cur_scale = 20;   
		uhp = 50;
		ga = "g";
		speed = 3;
		
		me_arm = 20;
		ra_arm = 20;
		ch_arm = 20;
		
		dama = 110;
		ap = 60;
		type = "ra";
		range = 7;
		ammo = 10;
		
		d_dama = 0;
		d_ap = 0;
	}
}

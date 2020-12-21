package com.chess.data.helga;

import com.chess.model.Arm;

public class Ballista extends Arm {

	public Ballista() {
		name = "Ballista";
		categ = "art";
		
		cost = 260;
		scale = 20;
		cur_scale = 20;   
		uhp = 50;
		ga = "g";
		speed = 3;
		
		me_arm = 40;
		ra_arm = 40;
		ch_arm = 40;
		
		dama = 110;
		ap = 60;
		type = "ra";
		range = 8;
		ammo = 20;
		
		d_dama = 5;
		d_ap = 0;
	}
}

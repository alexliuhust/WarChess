package com.chess.data;

import com.chess.model.Arm;

public class HeavyBallista extends Arm {

	public HeavyBallista() {
		name = "*Heavy Ballista";
		categ = "art";
		
		cost = 390;
		scale = 20;
		cur_scale = 20;   
		uhp = 50;
		ga = "g";
		speed = 2;
		
		me_arm = 30;
		ra_arm = 30;
		ch_arm = 30;
		
		dama = 150;
		ap = 65;
		type = "ra";
		range = 7;
		ammo = 10;
		
		d_dama = 0;
		d_ap = 0;
	}
}

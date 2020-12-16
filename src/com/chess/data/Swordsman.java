package com.chess.data;

import com.chess.model.Arm;

public class Swordsman extends Arm {

	public Swordsman(String alias_) {
		name = "Swordsman";
		alias = alias_;
		cost = 170;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 60;     
		ra_arm = 50;
		ch_arm = 0;
		
		dama = 20;         
		ap = 10;           
		type = "me";   
		range = 0;
		
		d_dama = 18;       
		d_ap = 10;         
	}

}

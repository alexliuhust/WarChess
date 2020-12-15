package com.chess.model;

public class Swordsman extends Arm {

	public Swordsman(String alias_) {
		name = "swordsman";
		alias = alias_;
		cost = 100;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 50;     
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

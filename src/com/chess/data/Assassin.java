package com.chess.data;

import com.chess.model.Arm;

public class Assassin extends Arm {

	public Assassin(String alias_) {
		name = "Assassin";
		alias = alias_;
		cost = 150;
		scale = 80;
		cur_scale = 80;   
		uhp = 40;    
		ga = "g";
		speed = 6;
		
		me_arm = 40;     
		ra_arm = 20;
		ch_arm = 0;
		
		dama = 38;         
		ap = 50;           
		type = "me";   
		range = 0;
		
		d_dama = 38;       
		d_ap = 50;         
	}
}

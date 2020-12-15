package com.chess.model;

public class Spearman extends Arm {

	public Spearman(String alias_) {
		name = "spearman";
		alias = alias_;
		cost = 100;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 50;     
		ra_arm = 50;
		ch_arm = 80;
		
		dama = 15;         
		ap = 50;           
		type = "me";   
		range = 0;
		
		d_dama = 11;       
		d_ap = 35;       
	}

}

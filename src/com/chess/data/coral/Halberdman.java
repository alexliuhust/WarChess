package com.chess.data.coral;

import com.chess.model.Arm;

public class Halberdman extends Arm {
	
	public Halberdman() {
		name = "Halberdman";
		categ = "inf";
		
		cost = 80;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 5;
		
		me_arm = 10;     
		ra_arm = 10;
		ch_arm = 75;
		
		dama = 14;         
		ap = 60;           
		type = "me";   
		range = 0;
		
		d_dama = 13;       
		d_ap = 60;         
	}

}

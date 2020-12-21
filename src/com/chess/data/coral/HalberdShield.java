package com.chess.data.coral;

import com.chess.model.Arm;

public class HalberdShield extends Arm {
	
	public HalberdShield() {
		name = "Halberd-Shield";
		categ = "inf";
		
		cost = 200;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 50;     
		ra_arm = 50;
		ch_arm = 85;
		
		dama = 15;         
		ap = 65;           
		type = "me";   
		range = 0;
		
		d_dama = 13;       
		d_ap = 65;         
	}

}
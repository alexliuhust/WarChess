package com.chess.data.green;

import com.chess.model.Arm;

public class Shadowblade extends Arm {
	
	public Shadowblade() {
		name = "Shadowblade";
		categ = "inf";
		
		cost = 100;
		scale = 80;
		cur_scale = 80;   
		uhp = 45;    
		ga = "g";
		speed = 6;
		
		me_arm = 0;     
		ra_arm = 80;
		ch_arm = 0;
		
		dama = 40;         
		ap = 50;           
		type = "me";   
		range = 0;
		
		d_dama = 38;       
		d_ap = 50;         
	}
}

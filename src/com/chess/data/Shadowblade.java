package com.chess.data;

import com.chess.model.Arm;

public class Shadowblade extends Arm {
	
	public Shadowblade() {
		name = "*Shadowblade";
		categ = "inf";
		
		cost = 230;
		scale = 80;
		cur_scale = 80;   
		uhp = 45;    
		ga = "g";
		speed = 6;
		
		me_arm = 45;     
		ra_arm = 30;
		ch_arm = 30;
		
		dama = 45;         
		ap = 50;           
		type = "me";   
		range = 0;
		
		d_dama = 40;       
		d_ap = 50;         
	}
}

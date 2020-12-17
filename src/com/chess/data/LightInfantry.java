package com.chess.data;

import com.chess.model.Arm;

public class LightInfantry extends Arm {

	public LightInfantry() {
		name = "Light Infantry";
		categ = "inf";
		
		cost = 160;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 20;     
		ra_arm = 20;
		ch_arm = 0;
		
		dama = 20;         
		ap = 10;           
		type = "me";   
		range = 0;
		
		d_dama = 18;       
		d_ap = 10;         
	}

}

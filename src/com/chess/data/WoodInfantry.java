package com.chess.data;

import com.chess.model.Arm;

public class WoodInfantry extends Arm {

	public WoodInfantry() {
		name = "Wood Infantry";
		categ = "inf";
		
		cost = 170;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 5;
		
		me_arm = 30;     
		ra_arm = 30;
		ch_arm = 0;
		
		dama = 22;         
		ap = 10;           
		type = "me";   
		range = 0;
		
		d_dama = 20;       
		d_ap = 10;         
	}

}

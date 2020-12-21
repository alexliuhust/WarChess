package com.chess.data.helga;

import com.chess.model.Arm;

public class Spearman extends Arm {

	public Spearman() {
		name = "Spearman";
		categ = "inf";
		
		cost = 110;
		scale = 100;
		cur_scale = 100;   
		uhp = 50;    
		ga = "g";
		speed = 4;
		
		me_arm = 40;     
		ra_arm = 50;
		ch_arm = 80;
		
		dama = 14;         
		ap = 50;           
		type = "me";   
		range = 0;
		
		d_dama = 11;       
		d_ap = 50;       
	}

}

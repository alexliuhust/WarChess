package com.chess.data;

import com.chess.model.Arm;

public class Treant extends Arm {

	public Treant() {
		name = "Treant";
		categ = "inf";
		
		cost = 530;
		scale = 20;
		cur_scale = 20;   
		uhp = 350;    
		ga = "g";
		speed = 3;
		
		me_arm = 80;     
		ra_arm = 80;
		ch_arm = 0;
		
		dama = 120;         
		ap = 20;           
		type = "me";   
		range = 0;
		
		d_dama = 85;       
		d_ap = 20;         
	}

}

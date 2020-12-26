package com.chess.model;

import java.util.Arrays;

public class Arm {
	
	public String name;
	public String alias;
	public String categ;
	
	public Integer cost;
	public Integer scale;
	public Integer cur_scale;
	public Integer uhp;
	public String ga; 
	public Integer speed;
	
	public Integer me_arm; 
	public Integer ra_arm;
	public Integer ch_arm;
	
	public Integer dama;
	public Boolean magic = false;
	public Integer ap;
	public String type;
	public Integer range;
	public Integer ammo = -1;
	
	public Integer d_dama;
	public Integer d_ap;
	
	public Integer defense;
	public Integer output;
	public String overview;
	
	public String anti;
	public Integer bonus;
	
	public Arm() {}
	
	/**
	 * Construct by cloning another Arm
	 * @param target
	 * @param alias
	 */
	public Arm(Arm target, String alias) {
		this.name      = target.name;          
		this.alias     = alias;
		this.categ     = target.categ;
		
		this.cost      = target.cost;          
		this.scale     = target.scale;        
		this.cur_scale = target.cur_scale;
		this.uhp       = target.uhp;          
		this.ga        = target.ga;           
		this.speed     = target.speed;  
		
		this.me_arm    = target.me_arm;       
		this.ra_arm    = target.ra_arm;       
		this.ch_arm    = target.ch_arm;       
		
		this.dama      = target.dama;  
		this.magic     = target.magic;
		this.ap        = target.ap;           
		this.type      = target.type;         
		this.range     = target.range;
		this.ammo      = target.ammo;
		
		this.d_dama    = target.d_dama;       
		this.d_ap      = target.d_ap;
		
		this.overview  = target.overview;
		this.output    = target.output;
		this.defense   = target.defense;
		
		this.anti      = target.anti;
		this.bonus     = target.bonus;
	}

	public String showCurrentScale() {
		int num = this.cur_scale * 20 / this.scale;
		if (this.cur_scale * 20 % this.scale != 0) num++;
		
		char[] bar = new char[20];
		Arrays.fill(bar, '.');
		for (int i = 0; i < num; i++) bar[i] = '|';
		
		int percent = this.cur_scale * 100 / this.scale;
		
		return percent + "% " + "[" + String.valueOf(bar) + "] " + 
			"(" + this.cur_scale + ")";
	}
	
	public String showRangeAndAmmo() {
		StringBuilder sb = new StringBuilder();
		sb.append(range);
		sb.append('(');
		if (ammo < 0){
			sb.append('*');
		} else {
			sb.append(ammo);
		}
		sb.append(')');
		return sb.toString();
	}
	
	public String showGA() {
		if (ga.equals("g")) 
			return "ground";
		else 
			return "air";
	}
	
	@Override
	public String toString() {
		return name + " [$" + cost + "]";
	}
	
}

package com.chess.model;

public class Arm {
	
	public String name;
	public String alias;
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
	public Integer ap;
	public String type;
	public Integer range;
	
	public Integer d_dama;
	public Integer d_ap;
	
	public Arm() {}
	
	/**
	 * Construct by cloning another Arm
	 * @param target
	 * @param alias
	 */
	public Arm(Arm target, String alias) {
		this.name      = target.name;          
		this.alias     = alias;               
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
		this.ap        = target.ap;           
		this.type      = target.type;         
		this.range     = target.range;        
		this.d_dama    = target.d_dama;       
		this.d_ap      = target.d_ap;         
	}
	
	@Override
	public String toString() {
		return "[" + alias + "-" + name + ", scale=" + scale + "]";
	}
}

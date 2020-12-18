package com.chess.data;

import java.util.ArrayList;
import java.util.List;

import com.chess.model.Arm;

public class ArmList {
	
	private List<Arm> list;
	
	public ArmList() {
		this.list = new ArrayList<Arm>();
	}
	
	public List<Arm> getList() {
		this.list.add(new Swordsman());
		this.list.add(new Spearman());
		this.list.add(new Archer());
		this.list.add(new Longbowman());
		this.list.add(new ShockCavalry());
		this.list.add(new Knight());
		this.list.add(new Ballista());
		this.list.add(new Catapult());
		
		this.list.add(new WoodInfantry());
		this.list.add(new Shadowblade());
		this.list.add(new Watcher());
		this.list.add(new Hunter());       
		this.list.add(new PiercingHunter());
		this.list.add(new StagRider());    
		this.list.add(new Treant());       
		
		
		return this.list;
	}
	
}

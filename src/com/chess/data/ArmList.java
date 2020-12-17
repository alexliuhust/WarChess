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
		
		this.list.add(new LightInfantry());
		this.list.add(new Swordsman());
		this.list.add(new Spearman());
		this.list.add(new Assassin());
		this.list.add(new Shadowblade());
		
		this.list.add(new Archer());
		this.list.add(new Watcher());
		this.list.add(new Longbowman());
		
		this.list.add(new RangeRider());
		this.list.add(new ShockCavalry());
		this.list.add(new Knight());
		this.list.add(new TempleGuard());		
		
		this.list.add(new Ballista());
		this.list.add(new HeavyBallista());
		this.list.add(new Catapult());
		
		return this.list;
	}
	

}

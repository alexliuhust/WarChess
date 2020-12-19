package com.chess.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.data.coral.*;
import com.chess.data.green.*;
import com.chess.data.helga.*;
import com.chess.model.Arm;

public class ArmList {
	
	private Map<String, List<Arm>> map;
	
	public ArmList() {
		this.map = new HashMap<>();
		
		List<Arm> list1 = new ArrayList<>();
		list1.add(new Swordsman());
		list1.add(new Spearman());
		list1.add(new Archer());
		list1.add(new Longbowman());
		list1.add(new Herald());
		list1.add(new Knight());
		list1.add(new Ballista());
		list1.add(new Catapult());
		map.put("Helga Empire", list1);
		
		List<Arm> list2 = new ArrayList<>();
		list2.add(new WoodInfantry());
		list2.add(new Shadowblade());
		list2.add(new Watcher());
		list2.add(new Hunter());       
		list2.add(new PiercingHunter());
		list2.add(new StagRider());    
		list2.add(new Dracaena());       
		list2.add(new HawkCavalry());      
		map.put("Greenfield", list2);
		
		List<Arm> list3 = new ArrayList<>();
		list3.add(new Halberdman());
		list3.add(new HalberdShield());
		list3.add(new GreatAxe());
		list3.add(new MarinesLight());
		list3.add(new MarinesShield());
		list3.add(new Fierycoral());
		list3.add(new AirrayRider());
		list3.add(new Aquadragnio());
		map.put("Coral City", list3);
		
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

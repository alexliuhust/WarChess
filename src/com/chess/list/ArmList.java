package com.chess.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.data.Archer;
import com.chess.data.Ballista;
import com.chess.data.Catapult;
import com.chess.data.Dracaena;
import com.chess.data.HawkCavalry;
import com.chess.data.Herald;
import com.chess.data.Hunter;
import com.chess.data.Knight;
import com.chess.data.Longbowman;
import com.chess.data.PiercingHunter;
import com.chess.data.Shadowblade;
import com.chess.data.Spearman;
import com.chess.data.StagRider;
import com.chess.data.Swordsman;
import com.chess.data.Watcher;
import com.chess.data.WoodInfantry;
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
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

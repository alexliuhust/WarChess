package com.chess.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.data.GetArms;
import com.chess.model.Arm;

public class ArmList {
	
	private Map<String, List<Arm>> map;
	
	public ArmList() {
		this.map = new HashMap<>();
		
		GetArms getArms = new GetArms();
		map.put("Helga Empire", getArms.getAllArms("Helga Empire"));
		map.put("Greenfield", getArms.getAllArms("Greenfield"));
		map.put("Coral City", getArms.getAllArms("Coral City"));
		map.put("Demon Hill", getArms.getAllArms("Demon Hill"));
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

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
		
		GetArms getArms = new GetArms("Helga Empire");
		map.put("Helga Empire", getArms.getAllArms());
		
		getArms = new GetArms("Greenfield");
		map.put("Greenfield", getArms.getAllArms());
		
		getArms = new GetArms("Coral City");
		map.put("Coral City", getArms.getAllArms());
		
		getArms = new GetArms("Demon Hill");
		map.put("Demon Hill", getArms.getAllArms());
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

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
		RaceList raceList = new RaceList();
		GetArms getArms = new GetArms();
		for (String race : raceList.getRaces()) {
			map.put(race, getArms.getAllArms(race));
		}
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

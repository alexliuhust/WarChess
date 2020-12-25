package com.chess.data;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.model.Arm;

public class GetArms {

	private Map<String, Arm> map;
	public GetArms() {
		map = new HashMap<>();
	}
	
	public List<Arm> getAllArms(String race) {
		setArmInfo(race);
		List<Arm> allArms = new ArrayList<>();
		for (String name : getAllNames(race)) {
			allArms.add(map.get(name));
		}
		return allArms;
	}
	
	private void setArmInfo(String race) {
		Connection con = null;
		DataAccess.setArmInfo(con, map, race);
	}
	private List<String> getAllNames(String race) {
		List<String> allNames = new ArrayList<>();
		Connection con = null;
		DataAccess.getAllArmNames(con, allNames, race);
		return allNames;
	}
	
}

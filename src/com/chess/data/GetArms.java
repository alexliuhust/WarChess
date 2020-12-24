package com.chess.data;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.model.Arm;

public class GetArms {

	private Map<String, Arm> map;
	private String race;
	public GetArms(String race) {
		this.race = race;
		map = new HashMap<>();
	}
	private void setArmInfo() {
		Connection con = null;
		map.clear();
		DataAccess.setArmInfo(con, map, this.race);
	}
	private List<String> getAllNames() {
		List<String> allNames = new ArrayList<>();
		Connection con = null;
		DataAccess.getAllArmNames(con, allNames, race);
		return allNames;
	}
	public List<Arm> getAllArms() {
		setArmInfo();
		List<Arm> allArms = new ArrayList<>();
		for (String name : getAllNames()) {
			allArms.add(map.get(name));
		}
		return allArms;
	}
}

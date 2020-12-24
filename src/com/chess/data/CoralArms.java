package com.chess.data;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.model.Arm;

public class CoralArms {
	private Map<String, Arm> map;
	
	public CoralArms() {
		map = new HashMap<>();
		
		Connection con = null;
		DataAccess.setArmInfo(con, map, "coral city");
	}
	
	public void allArms() {
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key).name);
		}
	}
	
	public List<String> getAllNames() {
		List<String> allNames = new ArrayList<>();
		Connection con = null;
		DataAccess.getAllArmNames(con, allNames, "coral city");
		return allNames;
	}
	
	public Arm getArm(String name) {
		return map.get(name);
	}
}

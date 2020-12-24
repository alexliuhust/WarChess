package com.chess.data;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.model.Arm;

public class HelgaArms {
	private Map<String, Arm> map;
	
	public HelgaArms() {
		map = new HashMap<>();
		Connection con = null;
		DataAccess.setArmInfo(con, map, "helga empire");
	}
	
	public void allArms() {
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
	
	public List<String> getAllNames() {
		List<String> allNames = new ArrayList<>();
		Connection con = null;
		DataAccess.getAllArmNames(con, allNames, "helga empire");
		return allNames;
	}
	
	public Arm getArm(String name) {
		return map.get(name);
	}
}

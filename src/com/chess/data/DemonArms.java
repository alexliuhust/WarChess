package com.chess.data;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import com.chess.model.Arm;

public class DemonArms {
	private Map<String, Arm> map;
	
	public DemonArms() {
		map = new HashMap<>();
		
		Connection con = null;
		DataAccess.setArmInfo(con, map, "demon hill");
	}
	
	public void allArms() {
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key).name);
		}
	}
	
	public Arm getArm(String name) {
		return map.get(name);
	}
}

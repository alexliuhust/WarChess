package com.chess.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chess.data.CoralArms;
import com.chess.data.DemonArms;
import com.chess.data.GreenArms;
import com.chess.data.HelgaArms;
import com.chess.model.Arm;

public class ArmList {
	
	private Map<String, List<Arm>> map;
	
	public ArmList() {
		this.map = new HashMap<>();
		
		List<Arm> list1 = new ArrayList<>();
		HelgaArms helgaArms = new HelgaArms();
		List<String> names1 = helgaArms.getAllNames();
		for (String name : names1) {
			list1.add(helgaArms.getArm(name));
		}
		map.put("Helga Empire", list1);
		
		List<Arm> list2 = new ArrayList<>();
		GreenArms greenArms = new GreenArms();
		List<String> names2 = greenArms.getAllNames();
		for (String name : names2) {
			list2.add(greenArms.getArm(name));
		}
		map.put("Greenfield", list2);
		
		List<Arm> list3 = new ArrayList<>();
		CoralArms coralArms = new CoralArms();
		List<String> names3 = coralArms.getAllNames();
		for (String name : names3) {
			list3.add(coralArms.getArm(name));
		}
		map.put("Coral City", list3);
		
		List<Arm> list4 = new ArrayList<>();
		DemonArms demonArms = new DemonArms();
		List<String> names4 = demonArms.getAllNames();
		for (String name : names4) {
			list4.add(demonArms.getArm(name));
		}
		map.put("Demon Hill", list4);
		
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

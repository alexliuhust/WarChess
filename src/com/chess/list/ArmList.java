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
		list1.add(helgaArms.getArm("Swordsman"));
		list1.add(helgaArms.getArm("Spearman"));
		list1.add(helgaArms.getArm("Archer"));
		list1.add(helgaArms.getArm("Longbowman"));
		list1.add(helgaArms.getArm("Herald"));
		list1.add(helgaArms.getArm("Knight"));
		list1.add(helgaArms.getArm("Ballista"));
		list1.add(helgaArms.getArm("Catapult"));
		map.put("Helga Empire", list1);
		
		List<Arm> list2 = new ArrayList<>();
		GreenArms greenArms = new GreenArms();
		list2.add(greenArms.getArm("Wood Infantry"));
		list2.add(greenArms.getArm("Shadowblade"));
		list2.add(greenArms.getArm("Dracaena"));       
		list2.add(greenArms.getArm("Watcher"));
		list2.add(greenArms.getArm("Hunter"));       
		list2.add(greenArms.getArm("Piercing Hunter"));
		list2.add(greenArms.getArm("Stag Rider"));
		list2.add(greenArms.getArm("Hawk Cavalry"));      
		map.put("Greenfield", list2);
		
		List<Arm> list3 = new ArrayList<>();
		CoralArms coralArms = new CoralArms();
		list3.add(coralArms.getArm("Halberdman"));
		list3.add(coralArms.getArm("Halberd-shield"));
		list3.add(coralArms.getArm("Great Axe"));
		list3.add(coralArms.getArm("Marines-light"));
		list3.add(coralArms.getArm("Marines-shield"));
		list3.add(coralArms.getArm("Fierycoral"));
		list3.add(coralArms.getArm("Airray Rider"));
		list3.add(coralArms.getArm("Aquadragnio"));
		map.put("Coral City", list3);
		
		List<Arm> list4 = new ArrayList<>();
		DemonArms demonArms = new DemonArms();
		list4.add(demonArms.getArm("Hound"));
		list4.add(demonArms.getArm("Hellgue"));
		list4.add(demonArms.getArm("Executioner"));
		list4.add(demonArms.getArm("Death Javelin"));
		list4.add(demonArms.getArm("Luniadeon"));
		list4.add(demonArms.getArm("Demonvoy"));
		list4.add(demonArms.getArm("Hell Rider"));
		list4.add(demonArms.getArm("Abysslon"));
		map.put("Demon Hill", list4);
		
	}
	
	public List<Arm> getList(String race) {
		return this.map.get(race);
	}
	
}

package com.chess.model;

import java.util.*;

public class User {

	private String username;
	private Map<String,Arm> troop;
	
	public User() {
		this.troop = new HashMap<>();
	}
	public User(String name) {
		this.troop = new HashMap<>();
		this.username = name;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public List<String[]> getSortedItems() {
		List<String[]> list = new ArrayList<>();
		for (String armName : troop.keySet()) {
			String[] item = new String[7];
			item[0] = armName;
			Arm arm = troop.get(armName);
			item[1] = arm.name;
			item[2] = arm.categ;
			item[3] = arm.showCurrentScale();
			item[4] = String.valueOf(arm.speed);
			item[5] = arm.showRangeAndAmmo();
			item[6] = arm.showGA();
			
			list.add(item);
		}
		Collections.sort(list, (a, b) -> {
			if (!a[2].equals(b[2])) {
				return b[2].compareTo(a[2]);
			}
			if (!a[1].equals(b[1])) {
				return a[1].compareTo(b[1]);
			}
			return a[0].compareTo(b[0]);
		});
		
		return list;
	}
	
	public void getInfo() {
		System.out.println("User " + username + " has troop:");
		List<String[]> list = this.getSortedItems();
		for (String[] item : list) {
			for (String s : item) {
				System.out.print(s + "|");
			}
			System.out.println();
		}
	}
	
	public boolean hasAlias(String alias) {
		return this.troop.containsKey(alias);
	}
	
	public Arm getArmByAlias(String alias) {
		return this.troop.get(alias);
	}
	
	public void addArm(String alias, Arm arm) {
		this.troop.put(alias, arm);
	}
	
	public void removeArm(String alias) {
		this.troop.remove(alias);
	}
	
	public boolean hasNoArm() {
		return this.troop.isEmpty();
	}
	
	@Override
	public String toString() {
		return this.username;
	}
	
	
}

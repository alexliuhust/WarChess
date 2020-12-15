package com.chess.model;

import java.util.*;

public class User {

	public String username;
	public Map<String,Arm> troop;
	
	public User() {
		this.troop = new HashMap<>();
	}
	public User(String name) {
		this.troop = new HashMap<>();
		this.username = name;
	}
	
	public void getInfo() {
		System.out.println("User " + username + " has troop:");
		for (String armName : troop.keySet()) {
			System.out.println(troop.get(armName));
		}
	}
}

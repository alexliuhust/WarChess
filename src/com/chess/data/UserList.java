package com.chess.data;

import java.util.ArrayList;
import java.util.List;

import com.chess.model.User;

public class UserList {
	
	private List<User> list;
	
	public UserList() {
		this.list = new ArrayList<User>();
	}
	
	public List<User> getList() {
		this.list.add(new User("Harry"));
		this.list.add(new User("Ron"));
		this.list.add(new User("Draco"));

		return this.list;
	}

}

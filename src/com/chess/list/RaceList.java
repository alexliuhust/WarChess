package com.chess.list;

import java.util.ArrayList;
import java.util.List;

public class RaceList {

	private List<String> list;
	public RaceList() {
		list = new ArrayList<>();
		list.add("Helga Empire");
		list.add("Greenfield");
		list.add("Coral City");
		list.add("Demon Hill");
		list.add("Snow Fort");
		
	}
	public List<String> getRaces() {
		return this.list;
	}
}

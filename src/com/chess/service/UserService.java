package com.chess.service;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.chess.list.RaceList;
import com.chess.list.UserList;
import com.chess.model.User;
import com.chess.view.FormUpTroopFrm;
import com.chess.view.UsersFrm;

public class UserService {
	
	
	public static void startPlayActionPerformed(ActionEvent event,UsersFrm usersFrm) {
		User p1 = (User) usersFrm.player1Jcb.getSelectedItem();
		User p2 = (User) usersFrm.player2Jcb.getSelectedItem();
		if (p1.username.equals(p2.username)) {
			JOptionPane.showMessageDialog(null, "Two Users cannot be identical!");
			return;
		}
		
		String race1 = (String) usersFrm.p1RaceJcb.getSelectedItem();
		String race2 = (String) usersFrm.p2RaceJcb.getSelectedItem();
		
		usersFrm.dispose();
		new FormUpTroopFrm(p1, p2, race1, race2).setVisible(true);
		
	}

	public static void fillUserJcb(UsersFrm usersFrm) {
		UserList userList = new UserList();
		for (User user : userList.getList()) {
			usersFrm.player1Jcb.addItem(user);
			usersFrm.player2Jcb.addItem(user);
		}
	}

	public static void fillRaceJcb(UsersFrm usersFrm) {
		RaceList raceList = new RaceList();
		for (String race: raceList.getRaces()) {
			usersFrm.p1RaceJcb.addItem(race);
			usersFrm.p2RaceJcb.addItem(race);
		}
	}
}

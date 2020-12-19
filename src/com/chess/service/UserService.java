package com.chess.service;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.chess.list.UserList;
import com.chess.model.User;
import com.chess.view.FormUpTroopFrm;
import com.chess.view.UsersFrm;

public class UserService {
	
	
	public static void startPlayActionPerformed(ActionEvent event, 
			JComboBox<User> player1Jcb, JComboBox<User> player2Jcb, UsersFrm usersFrm) {
		User p1 = (User) player1Jcb.getSelectedItem();
		User p2 = (User) player2Jcb.getSelectedItem();
		if (p1.username.equals(p2.username)) {
			JOptionPane.showMessageDialog(null, "Two Users cannot be identical!");
			return;
		}
		usersFrm.dispose();
		new FormUpTroopFrm(p1, p2).setVisible(true);
		
	}

	public static void fillUserJcb(JComboBox<User> player1Jcb, JComboBox<User> player2Jcb) {
		UserList userList = new UserList();
		for (User user : userList.getList()) {
			player1Jcb.addItem(user);
			player2Jcb.addItem(user);
		}
	}
}

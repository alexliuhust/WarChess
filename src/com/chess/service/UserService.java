package com.chess.service;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.chess.data.UserList;
import com.chess.model.User;
import com.chess.view.FormUpTroopFrm;
import com.chess.view.UsersFrm;

public class UserService {

	public static JComboBox<User> player1Jcb;
	public static JComboBox<User> player2Jcb;
	public static UsersFrm usersFrm;
	
	
	public static void startPlayActionPerformed(ActionEvent event) {
		User p1 = (User) player1Jcb.getSelectedItem();
		User p2 = (User) player2Jcb.getSelectedItem();
		if (p1.username.equals(p2.username)) {
			JOptionPane.showMessageDialog(null, "Two Users cannot be identical!");
			return;
		}
		usersFrm.dispose();
		new FormUpTroopFrm(p1, p2).setVisible(true);
		
	}

	public static void fillUserJcb() {
		UserList userList = new UserList();
		for (User user : userList.getList()) {
			player1Jcb.addItem(user);
			player2Jcb.addItem(user);
		}
	}
}

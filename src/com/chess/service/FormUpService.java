package com.chess.service;

import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.chess.list.ArmList;
import com.chess.model.Arm;
import com.chess.model.User;
import com.chess.util.StringUtil;
import com.chess.view.FormUpTroopFrm;
import com.chess.view.PlayGround;

public class FormUpService {
	
	public static void openPlayGround(ActionEvent event, FormUpTroopFrm formUpTroopFrm) {
		if (formUpTroopFrm.p1.hasNoArm() || formUpTroopFrm.p2.hasNoArm()) {
			JOptionPane.showMessageDialog(null, "Each player has to choose at least one arm!");
			return;
		}
		formUpTroopFrm.dispose();
		new PlayGround(formUpTroopFrm.p1, formUpTroopFrm.p2).setVisible(true);
	}
	
	public static void playerDeleteSelectedArm(JTable pArmsTable,User p,JTextField pTcTxt) {
		DefaultTableModel dtm = (DefaultTableModel) pArmsTable.getModel();
		int[] rows = pArmsTable.getSelectedRows();
		
		Integer cur_cost = Integer.parseInt(pTcTxt.getText());
		for(int i = 0; i < rows.length; i++) {
			String alias = (String) pArmsTable.getValueAt(rows[i], 0);
			cur_cost -= p.troop.get(alias).cost;
			p.removeArm(alias);
		}
		for(int i = 0; i < rows.length; i++) {
			dtm.removeRow(rows[i]-i);
		}
		//p.getInfo();
		pTcTxt.setText(String.valueOf(cur_cost));
	}
	
	public static void playerAddArm(JTextField pAlias, JTable pArmsTable, JComboBox<Arm> pArmJcb, User p, JTextField pTcTxt) {
		DefaultTableModel dtm = (DefaultTableModel) pArmsTable.getModel();
		Vector<String> v = new Vector<>();
		String alias = pAlias.getText();
		Arm target = (Arm) pArmJcb.getSelectedItem();
		Arm arm = new Arm(target, alias);
		
		if (StringUtil.isEmpty(alias)) {
			JOptionPane.showMessageDialog(null, "Alias cannot be empty!");
			return;
		}else if (p.troop.containsKey(alias)) {
			JOptionPane.showMessageDialog(null, "Alias has to be unique!");
			return;
		}
		p.addArm(alias, arm);
		v.add(alias);
		v.add(arm.name);
		dtm.addRow(v);
		//p.getInfo();
		
		Integer cur_cost = Integer.parseInt(pTcTxt.getText());
		cur_cost += arm.cost;
		pTcTxt.setText(String.valueOf(cur_cost));
	}

	public static void p2deleteSelectedArm(ActionEvent event, JTable p2ArmsTable, User p2, JTextField p2TcTxt) {
		playerDeleteSelectedArm(p2ArmsTable, p2, p2TcTxt);
	}
	
	public static void p1deleteSelectedArm(ActionEvent event, JTable p1ArmsTable, User p1, JTextField p1TcTxt) {
		playerDeleteSelectedArm(p1ArmsTable, p1, p1TcTxt);
	}

	public static void p2addAnArmToTable(ActionEvent event, 
			JTextField p2Alias, JTable p2ArmsTable, JComboBox<Arm> p2ArmJcb, User p2, JTextField p2TcTxt) {
		
		playerAddArm(p2Alias, p2ArmsTable, p2ArmJcb, p2, p2TcTxt);
	}
	
	public static void p1addAnArmToTable(ActionEvent event, 
			JTextField p1Alias, JTable p1ArmsTable, JComboBox<Arm> p1ArmJcb, User p1, JTextField p1TcTxt) {
		
		playerAddArm(p1Alias, p1ArmsTable, p1ArmJcb, p1, p1TcTxt);
	}

	public static void fillArmJcb(JComboBox<Arm> p1ArmJcb, JComboBox<Arm> p2ArmJcb, String race1, String race2) {
		ArmList armList = new ArmList();
		for (Arm arm : armList.getList(race1)) {
			p1ArmJcb.addItem(arm);
		}
		for (Arm arm : armList.getList(race2)) {
			p2ArmJcb.addItem(arm);
		}
	}
}

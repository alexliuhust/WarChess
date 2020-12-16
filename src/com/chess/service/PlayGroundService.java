package com.chess.service;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.chess.calculate.Calculate;
import com.chess.model.Arm;
import com.chess.model.User;
import com.chess.util.StringUtil;

public class PlayGroundService {
	
	public static void checkTotalDestruction(User pAtt, User pDef, Arm attacker, Arm defender) {
		if (attacker.cur_scale == 0) pAtt.removeArm(attacker.alias);
		if (defender.cur_scale == 0) pDef.removeArm(defender.alias);
	}
	
	public static void p2Attackp1(ActionEvent event,
			JTextField p1CbAliasTxt,JTextField p1CbNameTxt,JTextField p1CbCurTxt,
			JTextField p1CbSpTxt,JTextField p1CbRaTxt,JTextField p1CbGATxt,
			JTextField p2CbAliasTxt,JTextField p2CbNameTxt,JTextField p2CbCurTxt,
			JTextField p2CbSpTxt,JTextField p2CbRaTxt,JTextField p2CbGATxt,
			JTable p1ArmsTable, JTable p2ArmsTable, User p1, User p2) {
		
		if (StringUtil.isEmpty(p1CbAliasTxt.getText()) || StringUtil.isEmpty(p2CbAliasTxt.getText())) {
			JOptionPane.showMessageDialog(null, "Please select a record!");
			return;
		}
		String alias = p1CbAliasTxt.getText();
		Arm defender = p1.troop.get(alias);
		alias = p2CbAliasTxt.getText();
		Arm attacker = p2.troop.get(alias);
		
		Calculate.mainAttack(attacker, defender);
		//checkTotalDestruction(p2, p1, attacker, defender);
		
		fillCombatInfoPane(p1CbAliasTxt,p1CbNameTxt,p1CbCurTxt,p1CbSpTxt,p1CbRaTxt,p1CbGATxt, defender);
		fillCombatInfoPane(p2CbAliasTxt,p2CbNameTxt,p2CbCurTxt,p2CbSpTxt,p2CbRaTxt,p2CbGATxt, attacker);
		fillArmsTables(p1ArmsTable, p2ArmsTable, p1, p2);
	}

	public static void p1Attackp2(ActionEvent event,
			JTextField p1CbAliasTxt,JTextField p1CbNameTxt,JTextField p1CbCurTxt,
			JTextField p1CbSpTxt,JTextField p1CbRaTxt,JTextField p1CbGATxt,
			JTextField p2CbAliasTxt,JTextField p2CbNameTxt,JTextField p2CbCurTxt,
			JTextField p2CbSpTxt,JTextField p2CbRaTxt,JTextField p2CbGATxt,
			JTable p1ArmsTable, JTable p2ArmsTable, User p1, User p2) {
		if (StringUtil.isEmpty(p1CbAliasTxt.getText()) || StringUtil.isEmpty(p2CbAliasTxt.getText())) {
			JOptionPane.showMessageDialog(null, "Please select a record!");
			return;
		}
		String alias = p1CbAliasTxt.getText();
		Arm attacker = p1.troop.get(alias);
		alias = p2CbAliasTxt.getText();
		Arm defender = p2.troop.get(alias);
		
		Calculate.mainAttack(attacker, defender);
		//checkTotalDestruction(p1, p2, attacker, defender);
		
		fillCombatInfoPane(p1CbAliasTxt,p1CbNameTxt,p1CbCurTxt,p1CbSpTxt,p1CbRaTxt,p1CbGATxt, attacker);
		fillCombatInfoPane(p2CbAliasTxt,p2CbNameTxt,p2CbCurTxt,p2CbSpTxt,p2CbRaTxt,p2CbGATxt, defender);
		fillArmsTables(p1ArmsTable, p2ArmsTable, p1, p2);
	}

	public static void fillCombatInfoPane(JTextField pCbAliasTxt,JTextField pCbNameTxt,JTextField pCbCurTxt,
		JTextField pCbSpTxt,JTextField pCbRaTxt,JTextField pCbGATxt,Arm arm) {
		
		pCbAliasTxt.setText(arm.alias);
		pCbNameTxt.setText(arm.name);
		pCbCurTxt.setText(arm.showCurrentScale());
		pCbSpTxt.setText(String.valueOf(arm.speed));
		pCbRaTxt.setText(String.valueOf(arm.range));
		pCbGATxt.setText(arm.ga);
	}
	
	public static void getP2SelectedArm(MouseEvent e,JTextField p2CbAliasTxt,
			JTextField p2CbNameTxt,JTextField p2CbCurTxt,JTextField p2CbSpTxt,
			JTextField p2CbRaTxt,JTextField p2CbGATxt,JTable p2ArmsTable,User p2) {
		
		int row = p2ArmsTable.getSelectedRow();
		String alias = (String) p2ArmsTable.getValueAt(row, 0);
		Arm arm = p2.troop.get(alias);
		fillCombatInfoPane(p2CbAliasTxt,p2CbNameTxt,p2CbCurTxt,p2CbSpTxt,p2CbRaTxt,p2CbGATxt, arm);
	}

	public static void getP1SelectedArm(MouseEvent e,JTextField p1CbAliasTxt,
			JTextField p1CbNameTxt,JTextField p1CbCurTxt,JTextField p1CbSpTxt,
			JTextField p1CbRaTxt,JTextField p1CbGATxt,JTable p1ArmsTable,User p1) {
		
		int row = p1ArmsTable.getSelectedRow();
		String alias = (String) p1ArmsTable.getValueAt(row, 0);
		Arm arm = p1.troop.get(alias);
		fillCombatInfoPane(p1CbAliasTxt,p1CbNameTxt,p1CbCurTxt,p1CbSpTxt,p1CbRaTxt,p1CbGATxt, arm);
	}

	public static void fillArmsTables(JTable p1ArmsTable, JTable p2ArmsTable, User p1, User p2) {
		DefaultTableModel dtm = (DefaultTableModel) p1ArmsTable.getModel();
		dtm.setRowCount(0); // Clear table
		for (String[] item : p1.getSortedItems()) {
			dtm.addRow(item);
		}
		dtm = (DefaultTableModel) p2ArmsTable.getModel();
		dtm.setRowCount(0); // Clear table
		for (String[] item : p2.getSortedItems()) {
			dtm.addRow(item);
		}
	}
	
}

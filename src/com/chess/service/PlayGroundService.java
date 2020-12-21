package com.chess.service;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.chess.calculate.Calculate;
import com.chess.model.Arm;
import com.chess.model.User;
import com.chess.util.StringUtil;
import com.chess.view.PlayGround;

public class PlayGroundService {
	
	public static void checkTotalDestruction(User pAtt, User pDef, Arm attacker, Arm defender) {
		if (attacker.cur_scale == 0) pAtt.removeArm(attacker.alias);
		if (defender.cur_scale == 0) pDef.removeArm(defender.alias);
	}
	
	public static void p2Attackp1(ActionEvent event, PlayGround playGround) {
		
		if (StringUtil.isEmpty(playGround.p1CbAliasTxt.getText()) || StringUtil.isEmpty(playGround.p2CbAliasTxt.getText())) {
			JOptionPane.showMessageDialog(null, "Please select a record!");
			return;
		}
		String alias = playGround.p1CbAliasTxt.getText();
		Arm defender = playGround.p1.troop.get(alias);
		alias = playGround.p2CbAliasTxt.getText();
		Arm attacker = playGround.p2.troop.get(alias);
		
		Calculate.mainAttack(attacker, defender);
		//checkTotalDestruction(p2, p1, attacker, defender);
		
		fillCombatInfoPane(playGround.p1CbAliasTxt,playGround.p1CbNameTxt,playGround.p1CbCurTxt,
				playGround.p1CbSpTxt,playGround.p1CbRaTxt,playGround.p1CbGATxt, defender);
		fillCombatInfoPane(playGround.p2CbAliasTxt,playGround.p2CbNameTxt,playGround.p2CbCurTxt,
				playGround.p2CbSpTxt,playGround.p2CbRaTxt,playGround.p2CbGATxt, attacker);
		fillArmsTables(playGround);
	}

	public static void p1Attackp2(ActionEvent event, PlayGround playGround) {
		if (StringUtil.isEmpty(playGround.p1CbAliasTxt.getText()) || StringUtil.isEmpty(playGround.p2CbAliasTxt.getText())) {
			JOptionPane.showMessageDialog(null, "Please select a record!");
			return;
		}
		String alias = playGround.p1CbAliasTxt.getText();
		Arm attacker = playGround.p1.troop.get(alias);
		alias = playGround.p2CbAliasTxt.getText();
		Arm defender = playGround.p2.troop.get(alias);
		
		Calculate.mainAttack(attacker, defender);
		//checkTotalDestruction(p1, p2, attacker, defender);
		
		fillCombatInfoPane(playGround.p1CbAliasTxt,playGround.p1CbNameTxt,playGround.p1CbCurTxt,
				playGround.p1CbSpTxt,playGround.p1CbRaTxt,playGround.p1CbGATxt, attacker);
		fillCombatInfoPane(playGround.p2CbAliasTxt,playGround.p2CbNameTxt,playGround.p2CbCurTxt,
				playGround.p2CbSpTxt,playGround.p2CbRaTxt,playGround.p2CbGATxt, defender);
		fillArmsTables(playGround);
	}

	public static void fillCombatInfoPane(JTextField pCbAliasTxt,JTextField pCbNameTxt,JTextField pCbCurTxt,
		JTextField pCbSpTxt,JTextField pCbRaTxt,JTextField pCbGATxt,Arm arm) {
		
		pCbAliasTxt.setText(arm.alias);
		pCbNameTxt.setText(arm.name);
		pCbCurTxt.setText(arm.showCurrentScale());
		pCbSpTxt.setText(String.valueOf(arm.speed));
		pCbRaTxt.setText(arm.showRangeAndAmmo());
		pCbGATxt.setText(arm.ga);
	}
	
	public static void getP2SelectedArm(MouseEvent e, PlayGround playGround) {
		int row = playGround.p2ArmsTable.getSelectedRow();
		String alias = (String) playGround.p2ArmsTable.getValueAt(row, 0);
		Arm arm = playGround.p2.troop.get(alias);
		fillCombatInfoPane(playGround.p2CbAliasTxt,playGround.p2CbNameTxt,playGround.p2CbCurTxt,
				playGround.p2CbSpTxt,playGround.p2CbRaTxt,playGround.p2CbGATxt, arm);
	}

	public static void getP1SelectedArm(MouseEvent e,PlayGround playGround) {
		int row = playGround.p1ArmsTable.getSelectedRow();
		String alias = (String) playGround.p1ArmsTable.getValueAt(row, 0);
		Arm arm = playGround.p1.troop.get(alias);
		fillCombatInfoPane(playGround.p1CbAliasTxt,playGround.p1CbNameTxt,playGround.p1CbCurTxt,
				playGround.p1CbSpTxt,playGround.p1CbRaTxt,playGround.p1CbGATxt, arm);
	}

	public static void fillArmsTables(PlayGround playGround) {
		DefaultTableModel dtm = (DefaultTableModel) playGround.p1ArmsTable.getModel();
		dtm.setRowCount(0); // Clear table
		for (String[] item : playGround.p1.getSortedItems()) {
			dtm.addRow(item);
		}
		dtm = (DefaultTableModel) playGround.p2ArmsTable.getModel();
		dtm.setRowCount(0); // Clear table
		for (String[] item : playGround.p2.getSortedItems()) {
			dtm.addRow(item);
		}
	}
	
}

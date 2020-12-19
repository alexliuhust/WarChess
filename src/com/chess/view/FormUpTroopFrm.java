package com.chess.view;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.chess.model.Arm;
import com.chess.model.User;
import com.chess.service.FormUpService;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormUpTroopFrm extends JFrame {

	private JPanel contentPane;
	private JComboBox<Arm> p1ArmJcb;
	private JComboBox<Arm> p2ArmJcb;
	private JTextField p1Alias;
	private JTextField p2Alias;
	private JTable p1ArmsTable;
	private JTable p2ArmsTable;
	private JTextField p1TcTxt;
	private JTextField p2TcTxt;
	
	private User p1;
	private User p2;
	

	/**
	 * Create the frame.
	 */
	public FormUpTroopFrm(User player1, User player2, String race1, String race2) {
		p1 = player1;
		p2 = player2;
		
		p1TcTxt = new JTextField();
		p1TcTxt.setEditable(false);
		p1TcTxt.setBounds(108, 185, 66, 21);
		p1TcTxt.setColumns(10);
		p1TcTxt.setText("0");
		
		p2TcTxt = new JTextField();
		p2TcTxt.setEditable(false);
		p2TcTxt.setColumns(10);
		p2TcTxt.setBounds(437, 188, 66, 21);
		p2TcTxt.setText("0");
		
		setTitle("Form Up Your Troops");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("P1 " + player1.username);
		lblNewLabel.setBounds(103, 37, 90, 20);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		JLabel lblP = new JLabel("P2 " + player2.username);
		lblP.setBounds(446, 37, 93, 20);
		lblP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		p1ArmJcb = new JComboBox<Arm>();
		p1ArmJcb.setMaximumRowCount(20);
		p1ArmJcb.setBounds(35, 75, 245, 23);
		
		p2ArmJcb = new JComboBox<Arm>();
		p2ArmJcb.setMaximumRowCount(20);
		p2ArmJcb.setBounds(364, 75, 245, 23);
		
		p1Alias = new JTextField();
		p1Alias.setBounds(35, 127, 139, 27);
		p1Alias.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(192, 129, 88, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p1addAnArmToTable(e, p1Alias, p1ArmsTable, p1ArmJcb, player1, p1TcTxt);
			}
		});
		
		p2Alias = new JTextField();
		p2Alias.setBounds(364, 127, 139, 27);
		p2Alias.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setBounds(521, 129, 88, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p2addAnArmToTable(e, p2Alias, p2ArmsTable, p2ArmJcb, player2, p2TcTxt);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 225, 245, 240);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(364, 225, 245, 240);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(103, 475, 88, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p1deleteSelectedArm(e, p1ArmsTable, player1, p1TcTxt);
			}
		});
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setBounds(457, 475, 82, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p2deleteSelectedArm(e, p2ArmsTable, player2, p2TcTxt);
			}
		});
		
		JButton btnNewButton_6 = new JButton("PLAY");
		btnNewButton_6.setBounds(224, 504, 200, 39);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPlayGround(e);
			}
		});
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 23));
		
		p2ArmsTable = new JTable();
		p2ArmsTable.setModel(new DefaultTableModel(new Object[][] {},new String[] {"Alias", "Name"}) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(p2ArmsTable);
		
		p1ArmsTable = new JTable();
		p1ArmsTable.setModel(new DefaultTableModel(new Object[][] {},new String[] {"Alias", "Name"}) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(p1ArmsTable);
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblP);
		contentPane.add(p1ArmJcb);
		contentPane.add(p1Alias);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_4);
		contentPane.add(p2Alias);
		contentPane.add(btnNewButton_1);
		contentPane.add(p2ArmJcb);
		contentPane.add(scrollPane_1);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("Total Cost");
		lblNewLabel_1.setBounds(35, 188, 60, 15);
		contentPane.add(lblNewLabel_1);
		contentPane.add(p1TcTxt);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total Cost");
		lblNewLabel_1_1.setBounds(364, 191, 60, 15);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(p2TcTxt);
		
		FormUpService.fillArmJcb(p1ArmJcb, p2ArmJcb, race1, race2);
	}
	
	private void openPlayGround(ActionEvent event) {
		FormUpService.openPlayGround(event, p1, p2, this);
	}
}


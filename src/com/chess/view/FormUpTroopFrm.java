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
	
	private User p1;
	private User p2;

	/**
	 * Create the frame.
	 */
	public FormUpTroopFrm(User player1, User player2) {
		p1 = player1;
		p2 = player2;
		
		setTitle("Form Up Your Troops");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("P1 " + player1.username);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		JLabel lblP = new JLabel("P2 " + player2.username);
		lblP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		p1ArmJcb = new JComboBox<Arm>();
		
		p2ArmJcb = new JComboBox<Arm>();
		
		p1Alias = new JTextField();
		p1Alias.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p1addAnArmToTable(e, p1Alias, p1ArmsTable, p1ArmJcb, player1);
			}
		});
		
		p2Alias = new JTextField();
		p2Alias.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p2addAnArmToTable(e, p2Alias, p2ArmsTable, p2ArmJcb, player2);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p1deleteSelectedArm(e, p1ArmsTable, player1);
			}
		});
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormUpService.p2deleteSelectedArm(e, p2ArmsTable, player2);
			}
		});
		
		JButton btnNewButton_6 = new JButton("PLAY");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPlayGround(e);
			}
		});
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 23));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
					.addComponent(lblP)
					.addGap(94))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(p1ArmJcb, 0, 245, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(p1Alias, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(p2Alias, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addComponent(p2ArmJcb, 0, 245, Short.MAX_VALUE)
							.addComponent(scrollPane_1, 0, 0, Short.MAX_VALUE)))
					.addGap(24))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(220, Short.MAX_VALUE)
					.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(208))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblP, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(p2ArmJcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(p1ArmJcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(p1Alias, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(p2Alias, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_4))
					.addGap(28)
					.addComponent(btnNewButton_6)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		
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
		contentPane.setLayout(gl_contentPane);
		
		FormUpService.fillUserJcb(p1ArmJcb, p2ArmJcb);
	}
	
	private void openPlayGround(ActionEvent event) {
		FormUpService.openPlayGround(event, p1, p2, this);
	}
}


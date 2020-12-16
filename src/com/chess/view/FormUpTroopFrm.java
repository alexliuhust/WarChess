package com.chess.view;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.chess.data.ArmList;
import com.chess.model.Arm;
import com.chess.model.User;
import com.chess.util.StringUtil;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class FormUpTroopFrm extends JFrame {

	private JPanel contentPane;
	private JComboBox p1ArmJcb;
	private JComboBox p2ArmJcb;
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
		setBounds(100, 100, 650, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("P1 " + player1.username);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		JLabel lblP = new JLabel("P2 " + player2.username);
		lblP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		
		p1ArmJcb = new JComboBox();
		
		p2ArmJcb = new JComboBox();
		
		p1Alias = new JTextField();
		p1Alias.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1addAnArmToTable(e);
			}
		});
		
		p2Alias = new JTextField();
		p2Alias.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2addAnArmToTable(e);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
					.addComponent(lblP)
					.addGap(94))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(p1ArmJcb, 0, 245, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(p1Alias, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton))
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(p2Alias, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addComponent(p2ArmJcb, 0, 245, Short.MAX_VALUE)
						.addComponent(scrollPane_1, 0, 0, Short.MAX_VALUE))
					.addGap(24))
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
					.addContainerGap(109, Short.MAX_VALUE))
		);
		
		p2ArmsTable = new JTable();
		p2ArmsTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Alias", "Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(p2ArmsTable);
		
		p1ArmsTable = new JTable();
		p1ArmsTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Alias", "Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(p1ArmsTable);
		contentPane.setLayout(gl_contentPane);
		
		fillUserJcb();
	}
	
	
	private void playerAddArm(JTextField pAlias, JTable pArmsTable, JComboBox pArmJcb, User p) {
		DefaultTableModel dtm = (DefaultTableModel) pArmsTable.getModel();
		Vector<Object> v = new Vector<>();
		String alias = pAlias.getText();
		Arm target = (Arm) pArmJcb.getSelectedItem();
		Arm arm = new Arm();
		arm.name = target.name;
		arm.alias = alias;
		arm.cost = target.cost;
		arm.scale = target.scale;
		arm.cur_scale = target.cur_scale;
		arm.uhp   = target.uhp;   
		arm.ga    = target.ga;    
		arm.speed = target.speed; 
		arm.me_arm= target.me_arm;
		arm.ra_arm= target.ra_arm;
		arm.ch_arm= target.ch_arm;
		arm.dama  = target.dama;  
		arm.ap    = target.ap;    
		arm.type  = target.type;  
		arm.range = target.range; 
		arm.d_dama= target.d_dama;
		arm.d_ap  = target.d_ap;  
		
		if (StringUtil.isEmpty(alias)) {
			JOptionPane.showMessageDialog(null, "Alias cannot be empty!");
			return;
		}
		if (p.troop.containsKey(alias)) {
			JOptionPane.showMessageDialog(null, "Alias has to be unique!");
			return;
		}
		p.addArm(alias, arm);
		
		v.add(alias);
		v.add(arm.name);
		dtm.addRow(v);
		
		p.getInfo();
	}
	
	
	private void p2addAnArmToTable(ActionEvent e) {
		playerAddArm(p2Alias, p2ArmsTable, p2ArmJcb, p2);
	}
	
	private void p1addAnArmToTable(ActionEvent event) {
		playerAddArm(p1Alias, p1ArmsTable, p1ArmJcb, p1);
	}

	private void fillUserJcb() {
		ArmList armList = new ArmList();
		for (Arm arm : armList.getList()) {
			p1ArmJcb.addItem(arm);
			p2ArmJcb.addItem(arm);
		}
	}
}


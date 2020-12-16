package com.chess.view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.chess.model.Arm;
import com.chess.model.User;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PlayGround extends JFrame {

	private JPanel contentPane;

	private User p1;
	private User p2;
	private JTable p1ArmsTable;
	private JTable p2ArmsTable;
	private JTextField p1CbAliasTxt;
	private JTextField p1CbNameTxt;
	private JTextField p1CbCurTxt;
	private JTextField p1CbSpTxt;
	private JTextField p1CbRaTxt;
	private JTextField p1CbGATxt;
	private JTextField p2CbAliasTxt;
	private JTextField p2CbNameTxt;
	private JTextField p2CbCurTxt;
	private JTextField p2CbSpTxt;
	private JTextField p2CbRaTxt;
	private JTextField p2CbGATxt;

	/**
	 * Create the frame.
	 */
	public PlayGround(User p1, User p2) {
		setTitle("Play Ground");
		this.p1 = p1;
		this.p2 = p2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 813);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("P1");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblP = new JLabel("P2");
		lblP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Player 1", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("==>>");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("<<==");
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblP)
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE)))
					.addGap(21))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(92)
							.addComponent(lblNewLabel)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addComponent(lblP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(88)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alias");
		lblNewLabel_1_1.setBounds(33, 27, 28, 18);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setBounds(155, 27, 36, 18);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		
		p2CbAliasTxt = new JTextField();
		p2CbAliasTxt.setBounds(16, 51, 66, 21);
		p2CbAliasTxt.setEditable(false);
		p2CbAliasTxt.setColumns(10);
		
		p2CbNameTxt = new JTextField();
		p2CbNameTxt.setBounds(115, 51, 121, 21);
		p2CbNameTxt.setEditable(false);
		p2CbNameTxt.setColumns(10);
		
		p2CbCurTxt = new JTextField();
		p2CbCurTxt.setBounds(16, 82, 220, 21);
		p2CbCurTxt.setEditable(false);
		p2CbCurTxt.setColumns(10);
		
		JLabel lblNewLabel_3_3 = new JLabel("Speed");
		lblNewLabel_3_3.setBounds(28, 121, 34, 16);
		lblNewLabel_3_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Range");
		lblNewLabel_3_1_1.setBounds(113, 121, 35, 16);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_2_1 = new JLabel("G/A");
		lblNewLabel_3_2_1.setBounds(202, 121, 34, 16);
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		p2CbSpTxt = new JTextField();
		p2CbSpTxt.setBounds(16, 143, 46, 21);
		p2CbSpTxt.setEditable(false);
		p2CbSpTxt.setColumns(10);
		
		p2CbRaTxt = new JTextField();
		p2CbRaTxt.setBounds(102, 143, 46, 21);
		p2CbRaTxt.setEditable(false);
		p2CbRaTxt.setColumns(10);
		
		p2CbGATxt = new JTextField();
		p2CbGATxt.setBounds(190, 143, 46, 21);
		p2CbGATxt.setEditable(false);
		p2CbGATxt.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_1_1);
		panel_1.add(lblNewLabel_2_1);
		panel_1.add(p2CbAliasTxt);
		panel_1.add(p2CbNameTxt);
		panel_1.add(p2CbCurTxt);
		panel_1.add(lblNewLabel_3_3);
		panel_1.add(lblNewLabel_3_1_1);
		panel_1.add(lblNewLabel_3_2_1);
		panel_1.add(p2CbSpTxt);
		panel_1.add(p2CbRaTxt);
		panel_1.add(p2CbGATxt);
		
		JLabel lblNewLabel_1 = new JLabel("Alias");
		lblNewLabel_1.setBounds(33, 27, 28, 18);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(155, 27, 36, 18);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		
		p1CbAliasTxt = new JTextField();
		p1CbAliasTxt.setBounds(16, 51, 66, 21);
		p1CbAliasTxt.setEditable(false);
		p1CbAliasTxt.setColumns(10);
		
		p1CbNameTxt = new JTextField();
		p1CbNameTxt.setBounds(114, 51, 122, 21);
		p1CbNameTxt.setEditable(false);
		p1CbNameTxt.setColumns(10);
		
		p1CbCurTxt = new JTextField();
		p1CbCurTxt.setBounds(16, 82, 220, 21);
		p1CbCurTxt.setEditable(false);
		p1CbCurTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Speed");
		lblNewLabel_3.setBounds(28, 121, 34, 16);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1 = new JLabel("Range");
		lblNewLabel_3_1.setBounds(113, 121, 35, 16);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_2 = new JLabel("G/A");
		lblNewLabel_3_2.setBounds(202, 121, 34, 16);
		lblNewLabel_3_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		p1CbSpTxt = new JTextField();
		p1CbSpTxt.setBounds(16, 143, 46, 21);
		p1CbSpTxt.setEditable(false);
		p1CbSpTxt.setColumns(10);
		
		p1CbRaTxt = new JTextField();
		p1CbRaTxt.setBounds(102, 143, 46, 21);
		p1CbRaTxt.setEditable(false);
		p1CbRaTxt.setColumns(10);
		
		p1CbGATxt = new JTextField();
		p1CbGATxt.setBounds(190, 143, 46, 21);
		p1CbGATxt.setEditable(false);
		p1CbGATxt.setColumns(10);
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		panel.add(lblNewLabel_2);
		panel.add(p1CbAliasTxt);
		panel.add(p1CbNameTxt);
		panel.add(p1CbCurTxt);
		panel.add(p1CbSpTxt);
		panel.add(lblNewLabel_3);
		panel.add(lblNewLabel_3_1);
		panel.add(p1CbRaTxt);
		panel.add(p1CbGATxt);
		panel.add(lblNewLabel_3_2);
		
		p2ArmsTable = new JTable();
		p2ArmsTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getP2SelectedArm(e);
			}
		});
		p2ArmsTable.setModel(new DefaultTableModel(new Object[][] {},
			new String[] {"Alias", "Name", "Cur_scale", "Speed", "Range", "G/A"}) {
			
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		p2ArmsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		p2ArmsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		p2ArmsTable.getColumnModel().getColumn(2).setPreferredWidth(160);
		p2ArmsTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		p2ArmsTable.getColumnModel().getColumn(4).setPreferredWidth(20);
		p2ArmsTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		scrollPane_1.setViewportView(p2ArmsTable);
		
		p1ArmsTable = new JTable();
		p1ArmsTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getP1SelectedArm(e);
			}
		});
		p1ArmsTable.setModel(new DefaultTableModel(new Object[][] {},
			new String[] {"Alias", "Name", "Cur_scale", "Speed", "Range", "G/A"}) {
			
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		p1ArmsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		p1ArmsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		p1ArmsTable.getColumnModel().getColumn(2).setPreferredWidth(160);
		p1ArmsTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		p1ArmsTable.getColumnModel().getColumn(4).setPreferredWidth(20);
		p1ArmsTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		scrollPane.setViewportView(p1ArmsTable);
		
		contentPane.setLayout(gl_contentPane);
		
		fillArmsTables();
	}
	
	
	
	private void fillCombatInfoPane(JTextField pCbAliasTxt,JTextField pCbNameTxt,JTextField pCbCurTxt,
		JTextField pCbSpTxt,JTextField pCbRaTxt,JTextField pCbGATxt,Arm arm) {
		
		pCbAliasTxt.setText(arm.alias);
		pCbNameTxt.setText(arm.name);
		pCbCurTxt.setText(arm.showCurrentScale());
		pCbSpTxt.setText(String.valueOf(arm.speed));
		pCbRaTxt.setText(String.valueOf(arm.range));
		pCbGATxt.setText(arm.ga);
	}
	
	private void getP2SelectedArm(MouseEvent e) {
		int row = p2ArmsTable.getSelectedRow();
		String alias = (String) p2ArmsTable.getValueAt(row, 0);
		Arm arm = p2.troop.get(alias);
		fillCombatInfoPane(p2CbAliasTxt,p2CbNameTxt,p2CbCurTxt,p2CbSpTxt,p2CbRaTxt,p2CbGATxt, arm);
	}

	private void getP1SelectedArm(MouseEvent e) {
		int row = p1ArmsTable.getSelectedRow();
		String alias = (String) p1ArmsTable.getValueAt(row, 0);
		Arm arm = p1.troop.get(alias);
		fillCombatInfoPane(p1CbAliasTxt,p1CbNameTxt,p1CbCurTxt,p1CbSpTxt,p1CbRaTxt,p1CbGATxt, arm);
	}

	private void fillArmsTables() {
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




















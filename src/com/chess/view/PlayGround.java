package com.chess.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.chess.model.User;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PlayGround extends JFrame {

	private JPanel contentPane;

	private User p1;
	private User p2;
	private JTable p1ArmsTable;
	private JTable p2ArmsTable;

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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblP)
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)))
					.addGap(21))
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
					.addContainerGap(260, Short.MAX_VALUE))
		);
		
		p2ArmsTable = new JTable();
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




















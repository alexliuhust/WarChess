package com.chess.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.chess.model.User;
import com.chess.service.PlayGroundService;

public class PlayGround extends JFrame {

	private JPanel contentPane;

	public User p1;
	public User p2;
	public JTable p1ArmsTable;
	public JTable p2ArmsTable;
	public JTextField p1CbAliasTxt;
	public JTextField p1CbNameTxt;
	public JTextField p1CbCurTxt;
	public JTextField p1CbSpTxt;
	public JTextField p1CbRaTxt;
	public JTextField p1CbGATxt;
	public JTextField p2CbAliasTxt;
	public JTextField p2CbNameTxt;
	public JTextField p2CbCurTxt;
	public JTextField p2CbSpTxt;
	public JTextField p2CbRaTxt;
	public JTextField p2CbGATxt;
	public JTextField tossTxt;
	public JTextField p1OverviewTxt;
	public JTextField p2OverviewTxt;
	public JTextField p1OutputTxt;
	public JTextField p1DefenseTxt;
	public JTextField p2OutputTxt;
	public JTextField p2DefenseTxt;

	/**
	 * Create the frame.
	 */
	public PlayGround(User p1, User p2) {
		setTitle("Play Ground");
		this.p1 = p1;
		this.p2 = p2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel(p1.getUsername());
		lblNewLabel.setBounds(24, 97, 94, 25);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(128, 25, 519, 186);
		
		JLabel lblP = new JLabel(p2.getUsername());
		lblP.setBounds(21, 301, 97, 25);
		lblP.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(128, 217, 519, 186);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 434, 252, 253);
		panel.setBorder(new TitledBorder(null, p1.getUsername(), TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(382, 434, 252, 253);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), p2.getUsername(), TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("==>>");
		btnNewButton.setBounds(290, 491, 84, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1Attackp2(e);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("<<==");
		btnNewButton_1.setBounds(290, 532, 86, 31);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2Attackp1(e);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		
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
		p2CbCurTxt.setBounds(16, 110, 220, 21);
		p2CbCurTxt.setEditable(false);
		p2CbCurTxt.setColumns(10);
		
		JLabel lblNewLabel_3_3 = new JLabel("Speed");
		lblNewLabel_3_3.setBounds(28, 130, 34, 16);
		lblNewLabel_3_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Range");
		lblNewLabel_3_1_1.setBounds(113, 130, 35, 16);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_2_1 = new JLabel("G/A");
		lblNewLabel_3_2_1.setBounds(202, 130, 34, 16);
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		p2CbSpTxt = new JTextField();
		p2CbSpTxt.setBounds(16, 152, 46, 21);
		p2CbSpTxt.setEditable(false);
		p2CbSpTxt.setColumns(10);
		
		p2CbRaTxt = new JTextField();
		p2CbRaTxt.setBounds(102, 152, 46, 21);
		p2CbRaTxt.setEditable(false);
		p2CbRaTxt.setColumns(10);
		
		p2CbGATxt = new JTextField();
		p2CbGATxt.setBounds(190, 152, 46, 21);
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
		p1CbCurTxt.setBounds(16, 110, 220, 21);
		p1CbCurTxt.setEditable(false);
		p1CbCurTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Speed");
		lblNewLabel_3.setBounds(28, 130, 34, 16);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1 = new JLabel("Range");
		lblNewLabel_3_1.setBounds(113, 130, 35, 16);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_2 = new JLabel("G/A");
		lblNewLabel_3_2.setBounds(202, 130, 34, 16);
		lblNewLabel_3_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		
		p1CbSpTxt = new JTextField();
		p1CbSpTxt.setBounds(16, 152, 46, 21);
		p1CbSpTxt.setEditable(false);
		p1CbSpTxt.setColumns(10);
		
		p1CbRaTxt = new JTextField();
		p1CbRaTxt.setBounds(102, 152, 46, 21);
		p1CbRaTxt.setEditable(false);
		p1CbRaTxt.setColumns(10);
		
		p1CbGATxt = new JTextField();
		p1CbGATxt.setBounds(190, 152, 46, 21);
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
		p2ArmsTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		p2ArmsTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		p2ArmsTable.getColumnModel().getColumn(4).setPreferredWidth(40);
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
		p1ArmsTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		p1ArmsTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		p1ArmsTable.getColumnModel().getColumn(4).setPreferredWidth(40);
		p1ArmsTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		scrollPane.setViewportView(p1ArmsTable);
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(scrollPane);
		contentPane.add(lblP);
		contentPane.add(scrollPane_1);
		contentPane.add(panel);
		
		p1OverviewTxt = new JTextField();
		p1OverviewTxt.setEditable(false);
		p1OverviewTxt.setColumns(10);
		p1OverviewTxt.setBounds(16, 82, 220, 21);
		panel.add(p1OverviewTxt);
		
		JLabel lblNewLabel_4 = new JLabel("Output");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_4.setBounds(16, 188, 45, 15);
		panel.add(lblNewLabel_4);
		
		p1OutputTxt = new JTextField();
		p1OutputTxt.setEditable(false);
		p1OutputTxt.setBounds(76, 188, 91, 17);
		panel.add(p1OutputTxt);
		p1OutputTxt.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Defense");
		lblNewLabel_4_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(16, 213, 45, 15);
		panel.add(lblNewLabel_4_1);
		
		p1DefenseTxt = new JTextField();
		p1DefenseTxt.setEditable(false);
		p1DefenseTxt.setColumns(10);
		p1DefenseTxt.setBounds(76, 211, 91, 17);
		panel.add(p1DefenseTxt);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		contentPane.add(panel_1);
		
		p2OverviewTxt = new JTextField();
		p2OverviewTxt.setEditable(false);
		p2OverviewTxt.setColumns(10);
		p2OverviewTxt.setBounds(16, 82, 220, 21);
		panel_1.add(p2OverviewTxt);
		
		JLabel lblNewLabel_4_2 = new JLabel("Output");
		lblNewLabel_4_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(16, 187, 45, 15);
		panel_1.add(lblNewLabel_4_2);
		
		p2OutputTxt = new JTextField();
		p2OutputTxt.setEditable(false);
		p2OutputTxt.setColumns(10);
		p2OutputTxt.setBounds(76, 187, 91, 17);
		panel_1.add(p2OutputTxt);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Defense");
		lblNewLabel_4_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(16, 212, 45, 15);
		panel_1.add(lblNewLabel_4_1_1);
		
		p2DefenseTxt = new JTextField();
		p2DefenseTxt.setEditable(false);
		p2DefenseTxt.setColumns(10);
		p2DefenseTxt.setBounds(76, 210, 91, 17);
		panel_1.add(p2DefenseTxt);
		
		JButton btnNewButton_2 = new JButton("Toss");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tossAndShow(e);
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnNewButton_2.setBounds(283, 650, 93, 23);
		contentPane.add(btnNewButton_2);
		
		tossTxt = new JTextField();
		tossTxt.setEditable(false);
		tossTxt.setBounds(304, 683, 52, 21);
		contentPane.add(tossTxt);
		tossTxt.setColumns(10);
		tossTxt.setText("0");
		
		PlayGroundService.fillArmsTables(this);
	}

	private void getP1SelectedArm(MouseEvent e) {
		PlayGroundService.getP1SelectedArm(e, this);
	}

	private void getP2SelectedArm(MouseEvent e) {
		PlayGroundService.getP2SelectedArm(e, this);
	}

	private void p2Attackp1(ActionEvent e) {
		PlayGroundService.p2Attackp1(e, this);
	}

	private void p1Attackp2(ActionEvent e) {
		PlayGroundService.p1Attackp2(e, this);
	}

	private void tossAndShow(ActionEvent e) {
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		double rand = Math.random();
		if (rand < 0.1) tossTxt.setText("1");
		else if (rand < 0.6) tossTxt.setText("2");
		else if (rand < 0.85) tossTxt.setText("3");
		else tossTxt.setText("4");
		
	}
}

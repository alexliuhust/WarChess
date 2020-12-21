package com.chess.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.chess.model.User;
import com.chess.service.UserService;

public class UsersFrm extends JFrame {

	public JPanel contentPane;
	public JComboBox<User> player1Jcb;
	public JComboBox<User> player2Jcb;
	public JComboBox<String> p1RaceJcb;
	public JComboBox<String> p2RaceJcb;

	/**
	 * Create the frame.
	 */
	public UsersFrm() {
		setTitle("All Users");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setBounds(66, 79, 52, 21);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		
		player1Jcb = new JComboBox<>();
		player1Jcb.setBounds(128, 80, 254, 24);
		
		JLabel lblPlayer = new JLabel("Player 2");
		lblPlayer.setBounds(66, 212, 58, 21);
		lblPlayer.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		
		player2Jcb = new JComboBox<>();
		player2Jcb.setBounds(128, 213, 254, 24);
		
		JButton btnNewButton_1 = new JButton("Play");
		btnNewButton_1.setBounds(136, 343, 181, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startPlayActionPerformed(e);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Acient War Chess");
		lblNewLabel_1.setBounds(143, 15, 174, 30);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(player1Jcb);
		contentPane.add(lblPlayer);
		contentPane.add(player2Jcb);
		contentPane.add(btnNewButton_1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblRace.setBounds(66, 125, 52, 21);
		contentPane.add(lblRace);
		
		p1RaceJcb = new JComboBox<>();
		p1RaceJcb.setBounds(128, 127, 254, 24);
		contentPane.add(p1RaceJcb);
		
		JLabel lblRace_1 = new JLabel("Race");
		lblRace_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblRace_1.setBounds(66, 263, 52, 21);
		contentPane.add(lblRace_1);
		
		p2RaceJcb = new JComboBox<>();
		p2RaceJcb.setBounds(128, 265, 254, 24);
		contentPane.add(p2RaceJcb);
		
		UserService.fillUserJcb(this);
		UserService.fillRaceJcb(this);
	}

	private void startPlayActionPerformed(ActionEvent e) {
		UserService.startPlayActionPerformed(e, this);
	}
}
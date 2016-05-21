package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class timeChoice1 extends JFrame {

	JPanel timeChoicePanel;
	JLabel movie;
	JButton time1;
	JButton time2;
	JButton time3;
	JButton time4;
	JButton time5;
	JButton back;

	public timeChoice1() {
		super("JAVA를 JAVA라 영화예매");

		timeChoicePanel = new JPanel();
		movie = new JLabel("Captain America");
		movie.setForeground(Color.BLACK);
		movie.setFont(movie.getFont().deriveFont(12.0f));
		time1 = new JButton("9:00");
		time2 = new JButton("11:45");
		time3 = new JButton("15:20");
		time4 = new JButton("17:50");
		time5 = new JButton("22:20");
		back = new JButton("뒤로");

		setSize(500, 500);
		setLocation(500, 280);
		timeChoicePanel.setLayout(null);

		movie.setBounds(190, 0, 100, 100);
		time1.setBounds(100, 100, 80, 40);
		time2.setBounds(180, 100, 80, 40);
		time3.setBounds(260, 100, 80, 40);
		time4.setBounds(100, 180, 80, 40);
		time5.setBounds(180, 180, 80, 40);
		back.setBounds(80,40,60,20);

		timeChoicePanel.add(movie);
		timeChoicePanel.add(time1);
		timeChoicePanel.add(time2);
		timeChoicePanel.add(time3);
		timeChoicePanel.add(time4);
		timeChoicePanel.add(time5);
		timeChoicePanel.add(back);

		getContentPane().add(timeChoicePanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		time1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatChoice1 sc1 = new seatChoice1();
				dispose();
			}
		});

		time2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatChoice1 sc1 = new seatChoice1();
				dispose();
			}
		});

		time3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatChoice1 sc1 = new seatChoice1();
				dispose();
			}
		});

		time4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatChoice1 sc1 = new seatChoice1();
				dispose();
			}
		});

		time5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatChoice1 sc1 = new seatChoice1();
				dispose();
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MovieChoice mc = new MovieChoice();
				dispose();
			}
		});
	}

}

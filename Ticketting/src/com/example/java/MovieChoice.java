package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class MovieChoice extends JFrame {
	JButton movieChoice1;
	JButton movieChoice2;
	JButton movieChoice3;
	JButton movieChoice4;
	JButton movieChoice5;
	JPanel movieChoicePanel;
	JLabel movie1;
	JLabel movie2;
	JLabel movie3;
	JLabel movie4;
	JLabel movie5;
	JLabel title;

	public MovieChoice() {
		super("JAVA를 JAVA라 영화예매");

		movieChoicePanel = new JPanel();
		movieChoice1 = new JButton("예매");
		movieChoice2 = new JButton("예매");
		movieChoice3 = new JButton("예매");
		movieChoice4 = new JButton("예매");
		movieChoice5 = new JButton("예매");
		movie1 = new JLabel("Captain America");
		movie2 = new JLabel("Avengers");
		movie3 = new JLabel("Harry Potter");
		movie4 = new JLabel("Spiderman");
		movie5 = new JLabel("Frozen");

		setSize(500, 500);
		setLocation(500, 280);
		movieChoicePanel.setLayout(null);

		movie1.setBounds(100, 50, 100, 30);
		movie2.setBounds(100, 100, 100, 30);
		movie3.setBounds(100, 150, 100, 30);
		movie4.setBounds(100, 200, 100, 30);
		movie5.setBounds(100, 250, 100, 30);
		movieChoice1.setBounds(250, 50, 100, 30);
		movieChoice2.setBounds(250, 100, 100, 30);
		movieChoice3.setBounds(250, 150, 100, 30);
		movieChoice4.setBounds(250, 200, 100, 30);
		movieChoice5.setBounds(250, 250, 100, 30);

		movieChoicePanel.add(movieChoice1);
		movieChoicePanel.add(movieChoice2);
		movieChoicePanel.add(movieChoice3);
		movieChoicePanel.add(movieChoice4);
		movieChoicePanel.add(movieChoice5);
		movieChoicePanel.add(movie1);
		movieChoicePanel.add(movie2);
		movieChoicePanel.add(movie3);
		movieChoicePanel.add(movie4);
		movieChoicePanel.add(movie5);

		getContentPane().add(movieChoicePanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		movieChoice1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				timeChoice1 tc1 = new timeChoice1();
				dispose();
			}
		});
		
		movieChoice2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				timeChoice1 tc1 = new timeChoice1();
				dispose();
			}
		});
		
		movieChoice3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				timeChoice1 tc1 = new timeChoice1();
				dispose();
			}
		});
		
		movieChoice4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				timeChoice1 tc1 = new timeChoice1();
				dispose();
			}
		});
		
		movieChoice5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				timeChoice1 tc1 = new timeChoice1();
				dispose();
			}
		});

	}
}

package com.example.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class NewUser extends JFrame {
	  JButton create;
	  JPanel newUserPanel;
	  JTextField txuserer;
	  JTextField passer;
	  JLabel username;
	  JLabel password;


	  NewUser(){
	    super("JAVA�� JAVA�� ��ȭ����");

	    create = new JButton("ȸ������ �Ϸ�");
	    newUserPanel = new JPanel();
	    txuserer = new JTextField(15);
	    passer = new JPasswordField(15);
	    username = new JLabel("ID");
	    password = new JLabel("Pw");



	    setSize(300,200);
	    setLocation(500,280);
	    newUserPanel.setLayout (null); 


	    txuserer.setBounds(70,30,150,20);
	    passer.setBounds(70,65,150,20);
	    create.setBounds(80,100,120,30);
	    username.setBounds(20,28,80,20);
	    password.setBounds(20,63,80,20);


	    newUserPanel.add(create);
	    newUserPanel.add(txuserer);
	    newUserPanel.add(passer);
	    newUserPanel.add(username);
	    newUserPanel.add(password);


	    getContentPane().add(newUserPanel);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);

	    Writer writer = null;
	    File check = new File("userPass.txt");        //�������� ������
	    if(check.exists()){

	     
	    }else{
	      try{
	        File texting = new File("userPass.txt");
	        writer = new BufferedWriter(new FileWriter(texting));
	        writer.write("message");
	      }catch(IOException e){
	        e.printStackTrace();
	      }
	    }                




	    create.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        try {                                          //�������� ������
	    File file = new File("userPass.txt");
	    Scanner scan = new Scanner(file);;

	      FileWriter filewrite = new FileWriter(file, true);

	      String usertxter = " ";
	      String passtxter = " ";
	      String punamer = txuserer.getText();
	      String ppaswder = passer.getText();
	      while (scan.hasNext()) {
	        usertxter = scan.nextLine();
	        passtxter = scan.nextLine();
	      }

	        if(punamer.equals(usertxter) && ppaswder.equals(passtxter)) {
	           JOptionPane.showMessageDialog(null,"�̹� ������� ID �Դϴ�.");
	          txuserer.setText("");
	          passer.setText("");
	          txuserer.requestFocus();

	        } 
	        else if(punamer.equals("") && ppaswder.equals("")){
	        JOptionPane.showMessageDialog(null,"���̵�� ��й�ȣ�� �Է��Ͻʽÿ�. ");
	        }
	        else {
	        filewrite.write(punamer+"\r\n" +ppaswder+ "\r\n");
	        filewrite.close();
	        JOptionPane.showMessageDialog(null,"������ �����Ǿ����ϴ�. "); 
	        dispose();
	        login log = new login();



	        }
	        } catch (IOException d) {
	      d.printStackTrace();
	    }

	      }
	    });
	  } 

	}

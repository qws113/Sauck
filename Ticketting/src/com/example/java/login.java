package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.InputStream;

public class login extends JFrame {
  JButton blogin;
  JPanel loginpanel;
  JTextField txuser;
  JTextField pass;
  JButton newUSer;
  JLabel username;
  JLabel password;
  
 

  public login(){
    super("JAVA�� JAVA�� ��ȭ����");

    blogin = new JButton("Login");
    loginpanel = new JPanel();
    txuser = new JTextField(15);
    pass = new JPasswordField(15);
    newUSer = new JButton("ȸ������");
    username = new JLabel("ID");
    password = new JLabel("Pw");

    setSize(300,200);
    setLocation(500,280);
    loginpanel.setLayout (null); 


    txuser.setBounds(70,30,150,20);
    pass.setBounds(70,65,150,20);
    blogin.setBounds(80,100,100,20);
    newUSer.setBounds(80,135,100,20);
    username.setBounds(20,28,80,20);
    password.setBounds(20,63,80,20);

    loginpanel.add(blogin);
    loginpanel.add(txuser);
    loginpanel.add(pass);
    loginpanel.add(newUSer);
    loginpanel.add(username);
    loginpanel.add(password);

    getContentPane().add(loginpanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    Writer writer = null;
    File check = new File("userPass.txt");
    if(check.exists()){

      
    }else{
      try{
        File texting = new File("userPass.txt");
        writer = new BufferedWriter(new FileWriter(texting));
        writer.write("message");
      }catch(IOException e){
        e.printStackTrace();
      }
    }   //�̺κ��� �������� ȸ���� ���� �����;���




    blogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          File file = new File("userPass.txt");
          Scanner scan = new Scanner(file);;
          String line = null;
          FileWriter filewrite = new FileWriter(file, true);  

          String usertxt = " ";
          String passtxt = " ";
          String puname = txuser.getText();
          String ppaswd = pass.getText();


          while (scan.hasNext()) {
            usertxt = scan.nextLine();
            passtxt = scan.nextLine();

          }




          if(puname.equals(usertxt) && ppaswd.equals(passtxt)) {
            MainMenu menu =new MainMenu();
            MovieChoice mc = new MovieChoice();
            dispose();
          } 
          else if(puname.equals("") && ppaswd.equals("")){
            JOptionPane.showMessageDialog(null,"���̵�� ��й�ȣ�� �Է����ֽʽÿ�.");
          }
          else {

            JOptionPane.showMessageDialog(null,"���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ");
            txuser.setText("");
            pass.setText("");
            txuser.requestFocus();
          }
        } catch (IOException d) {
          d.printStackTrace();
        }

      }
    });               //�̺κе� ��������

    newUSer.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        NewUser user = new NewUser();
        dispose();

      }
    });
  }




}
 



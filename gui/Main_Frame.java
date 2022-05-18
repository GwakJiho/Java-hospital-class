package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main_Frame extends JFrame{
	
	JLabel home = new JLabel("Home");
	
	
	Main_Frame(){
		setTitle("Hospital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		
		
		setSize(1000,500);
		setVisible(true);
	}

}

package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Main_Frame extends JFrame{
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu menu_list[] = new JMenu[4];
	String menu_name[] = {"Home", "File","Search", "Help"};
	String [][]detail_menu = {{"입력", "삭제"},{"추가","삭제", "관리"},{"전체","의사", "간호사","직원"},{"도움말"}};
	
	JLabel fir = new JLabel("hello");
	JLabel fir2 = new JLabel("hello");
	JLabel fir3 = new JLabel("hello");
	JLabel fir4 = new JLabel("hellodsadsadsadsadas");
	JLabel fir5 = new JLabel("hellodasdsadsadsadsadsa");
	JLabel fir6 = new JLabel("hellosadsadsadsadasdsa");
	JLabel fir7 = new JLabel("hellodsadsadsadsadsad");
	
	public Main_Frame(){
		setTitle("Hospital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel left_menu = new JPanel();
		JPanel center = new JPanel();
		
		//menu setting
		setting_menu();
		
		
		//============================top 컨테이너 내부 관리====
		
		
		

		
		
		//============================center 컨테이너 내부 관리====
		center.setBackground(Color.white);
		add(center, BorderLayout.CENTER);
		//============================West 컨테이너 내부 관리====
		left_menu.setBackground(Color.gray);
		left_menu.add(fir);
		left_menu.add(fir2);
		left_menu.add(fir3);
		left_menu.add(fir4);
		left_menu.add(fir5);
		left_menu.add(fir6);
		left_menu.add(fir7);
		add(left_menu, BorderLayout.WEST);
		
		//============================Frame 내부 관리====
		
		setJMenuBar(menuBar);
		setBackground(Color.WHITE);
		setSize(1500,800);
		setVisible(true);
	}
	
	private void setting_menu() {
		int count = 0, set= 0;
		for (int i = 0; i<menu_list.length ; i++) {
			menu_list[i] = new JMenu(menu_name[i]);
			for(int j = 0; j < detail_menu[i].length; j++) {
				count ++;
				
			}
			menuBar.add(menu_list[i]);
		}
		
		JMenuItem []item = new JMenuItem[count];
		for (int i = 0; i <menu_list.length; i++) {
			for(int j = 0; j < detail_menu[i].length; j++) {
				item[set] = new JMenuItem(detail_menu[i][j]);
				menu_list[i].add(item[set++]);
					
			}
		}
	}

}

package person;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ListView;

import hospital.Room;
import hospital.Room_person;
import medical.Medical_department;
import medical.Medical_personal;

public class Main {
	
	
		
	public void Delete_object(Person obj) {
		obj = null;
	}
	
	public static void main(String[] args) {
			Room_person Rp = new Room_person();
			Medical_personal s = new Medical_personal();
			
			
			
			Patient p1 = new Patient("환자", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p2 = new Patient("환자2", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p3 = new Patient("환자3", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p4 = new Patient("환자4", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			p1.setting_Admission(193423, 601, Rp);
			p2.setting_Admission(193423, 601, Rp);
			p3.setting_Admission(193423, 601, Rp);
			p4.setting_Admission(193423, 601, Rp);
			
			/*
			d.add_team(s);
			d3.add_team(s);
			d4.add_team(s);
			d2.add_team(s);
			d2.get_team_member(s);
			d2.delete_team(s);
			d5.add_team(s);
			d6.add_team(s);
			d7.add_team(s);
			//N1.add_team(s);
			//p.add_team(s);
			//d.get_team_member(s);
			//N1.get_team_member(s);
			//p.get_team_member(s);
			//d.get_team_member(s);
		*/
			//d3.move_department(s, 1235);
			//d2.get_team_member(s);
			//d3.get_team_member(s);
			
			Room R = Rp.set_room(601);
			R.get_room_memeber();
			
			
			
			new Main_Frame(s, Rp);
		}
	
	}



class Main_Frame extends JFrame{
		Medical_department depart = new Medical_department();
		Staff staff_ = new Staff();
	  
	   
	   public Main_Frame(Medical_personal s, Room_person Rp){
	      setTitle("Hospital");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(new BorderLayout());
	      
	      JPanel left_menu = new JPanel();
	      left_menu.setSize(300, 800);
	      left_menu.setLayout(new FlowLayout());
	      JPanel center = new JPanel();
	      center.setSize(1100,800);
	      //menu setting
	 
	     

	      //============================West 컨테이너 내부 관리====
	      
	    
	      
	      String []label_menu = {"이름", "생년월일", "성별", "전화번호", "부서" , "직원 번호", "직업"};
	      String []부서 = {"보안관리과", "외과","내과"};
	      String []성별 = {"남자", "여자"};
	      String []직종 = {"의사", "간호사", "프로그래머"};
	      JComboBox combo = new JComboBox(부서);
	      JComboBox combo2 = new JComboBox(성별);
	      JComboBox combo3 = new JComboBox(직종);
	      JLabel lab[] = new JLabel[7];
	      JTextField input_value[] = new JTextField[7];
	      
	      for (int i = 0 ; i<lab.length ; i++) {
	    	  lab[i] = new JLabel(label_menu[i]);
	    	  lab[i].setHorizontalAlignment(JLabel.CENTER);
	    	  left_menu.add(lab[i]);
	    	  input_value[i] = new JTextField(20);
	    	  if( i == 2)
	    		  left_menu.add(combo2);
	    	  else if (i == 4) {
	    		  left_menu.add(combo);
	    	  }
	    	  else if( i == 6) {
	    		  left_menu.add(combo3);
	    	  }
	    	  else {
		    	  left_menu.add(input_value[i]);
	    	  }
	      }
	      
	      
	      add(left_menu, BorderLayout.NORTH);
	      
	      
	      

	      //============================center 컨테이너 내부 관리====
	      JPanel panel_ = new JPanel();
	      panel_.setLayout(new BorderLayout());
	      
	      center.setLayout(new GridLayout(0,1));
	      JButton Total = new JButton("전체");
	      JButton Doctor = new JButton("의사");
	      JButton Nurse = new JButton("간호사");
	      JButton Programmer = new JButton("프로그래머");
	      Total.setBackground(null);
	      Doctor.setBackground(null);
	      Nurse.setBackground(null);
	      Programmer.setBackground(null);
	      center.add(Total);
	      center.add(Doctor);
	      center.add(Nurse);
	      center.add(Programmer);
	      
	      center.setBackground(Color.white);
	      
	      
	      panel_.add(center, BorderLayout.EAST);
	      
	      //============================ List 내부 관리====
	      JPanel List_ = new JPanel();
	      String[] row = new String[8];
	      String header[] = {"성함" , "생년월일" , "성별", "전화번호" ,"부서", "나이" , "직원 번호", "직종"};
	      DefaultTableModel model = new DefaultTableModel(header, 0 );
	      JTable table = new JTable(model);
	      JScrollPane scrollPane = new JScrollPane(table);
	      
	      
	      panel_.add(scrollPane, BorderLayout.CENTER);
	       
	      //============================Frame 내부 관리====
	      
	      add(panel_, BorderLayout.CENTER);
	      
	      setBackground(Color.WHITE);
	      setSize(1500,800);
	      setVisible(true);
	      
	      JButton search = new JButton("검색");
	      left_menu.add(search);
	      JButton btn = new JButton("확인");
	      left_menu.add(btn);   
	      Medical_department s1 = s.set_team("보안관리과");
	      
	      class selector implements ActionListener{
	    	  public void actionPerformed(ActionEvent e) {
	    		  JButton b = (JButton)e.getSource();
			      if(b.getText().equals("전체")) {
			    	  	board(true, "");
				  }
				  else if(b.getText().equals("의사")) {
			    	  board(false, "의사");
				  }
				  else if(b.getText().equals("간호사")) {
					  board(false, "간호사");
				  }
				  else if(b.getText().equals("프로그래머")) {
					  board(false, "프로그래머");
				  }
	    	  }
	    	  
	    	  
	    	  private void board(boolean temp, String type) {
	    		  model.setNumRows(0);
	    		  Medical_department team_setting = s.set_team("내과");
	    		  Medical_department team_setting1 = s.set_team("외과");
	    		  Medical_department team_setting2 = s.set_team("보안관리과");
	    		  
	 			  for (Staff staf : team_setting.Member) {
	 				  String []row = new String[8];
	 				  if (!temp & staf.get_job() == type) {
	 				  row[0] = staf.get_name();
	 		    	  row[1] = staf.get_birth();
	 		    	  row[2] = staf.get_gender();
	 		    	  row[3] = staf.get_phone_num();
	 		    	  row[4] = staf.get_department();
	 		    	  row[5] = ""+staf.get_age();
	 		    	  row[6] = "" + staf.get_staff_id();
	 		    	  row[7] = staf.get_job();
	 		    	  
	 		    	  model.addRow(row);
	 				  }
	 		    	  if (temp) {
	 		    		 row[0] = staf.get_name();
		 		    	  row[1] = staf.get_birth();
		 		    	  row[2] = staf.get_gender();
		 		    	  row[3] = staf.get_phone_num();
		 		    	  row[4] = staf.get_department();
		 		    	  row[5] = ""+staf.get_age();
		 		    	  row[6] = "" + staf.get_staff_id();
		 		    	  row[7] = staf.get_job();
		 		    	  
		 		    	  model.addRow(row);
	 		    	  }
	 			  }
	 			 for (Staff staf : team_setting1.Member) {
	 				String []row = new String[8];
	 				  if (!temp & staf.get_job() == type) {
	 				  row[0] = staf.get_name();
	 		    	  row[1] = staf.get_birth();
	 		    	  row[2] = staf.get_gender();
	 		    	  row[3] = staf.get_phone_num();
	 		    	  row[4] = staf.get_department();
	 		    	  row[5] = ""+staf.get_age();
	 		    	  row[6] = "" + staf.get_staff_id();
	 		    	  row[7] = staf.get_job();
	 		    	  
	 		    	  model.addRow(row);
	 				  }
	 		    	  if (temp) {
	 		    		 row[0] = staf.get_name();
		 		    	  row[1] = staf.get_birth();
		 		    	  row[2] = staf.get_gender();
		 		    	  row[3] = staf.get_phone_num();
		 		    	  row[4] = staf.get_department();
		 		    	  row[5] = ""+staf.get_age();
		 		    	  row[6] = "" + staf.get_staff_id();
		 		    	  row[7] = staf.get_job();
		 		    	  
		 		    	  model.addRow(row);
	 		    	  }
	 			  }
	 			for (Staff staf : team_setting2.Member) {
	 				String []row = new String[8];
	 				  if (!temp & staf.get_job() == type) {
	 				  row[0] = staf.get_name();
	 		    	  row[1] = staf.get_birth();
	 		    	  row[2] = staf.get_gender();
	 		    	  row[3] = staf.get_phone_num();
	 		    	  row[4] = staf.get_department();
	 		    	  row[5] = ""+staf.get_age();
	 		    	  row[6] = "" + staf.get_staff_id();
	 		    	  row[7] = staf.get_job();
	 		    	  
	 		    	  model.addRow(row);
	 				  }
	 		    	  if (temp) {
	 		    		 row[0] = staf.get_name();
		 		    	  row[1] = staf.get_birth();
		 		    	  row[2] = staf.get_gender();
		 		    	  row[3] = staf.get_phone_num();
		 		    	  row[4] = staf.get_department();
		 		    	  row[5] = ""+staf.get_age();
		 		    	  row[6] = "" + staf.get_staff_id();
		 		    	  row[7] = staf.get_job();
		 		    	  
		 		    	  model.addRow(row);
	 		    	  }
	 			  }
	 	     }
	      }
					  
	    
	      
	      class myListener implements ActionListener{
	    	  public void actionPerformed(ActionEvent e) {
	    		  JButton b = (JButton)e.getSource();
	    		 
	    		  int age = Integer.parseInt(input_value[1].getText().split("-")[0]);
	    		  age = 2022 - age + 1;
	    		  System.out.println(age);
	    		  if(b.getText().equals("확인")) {
	    			  if(combo3.getSelectedItem().toString().equals("의사")) {
	    				  Staff t = new Staff(input_value[0].getText(),input_value[1].getText(),combo2.getSelectedItem().toString(),
		    					  input_value[3].getText(),depart.get_code(combo.getSelectedItem().toString()), age,
		    					  Integer.parseInt(input_value[5].getText()),combo3.getSelectedItem().toString());
	    				  System.out.println(combo3.getSelectedItem().toString());
	    				  
		    			  t.add_team(s);
		    			  t.get_team_member(s);
		    			  String[] row  = new String[8];
		    			  
	    		    	  row[0] = t.get_name();
	    		    	  row[1] = t.get_birth();
	    		    	  row[2] = t.get_gender();
	    		    	  row[3] = t.get_phone_num();
	    		    	  row[4] = t.get_department();
	    		    	  row[5] = ""+t.get_age();
	    		    	  row[6] = "" + t.get_staff_id();
	    		    	  row[7] = t.get_job();
	    		    	  
	    		    	  model.addRow(row);
	    			  }
	    			  else if(combo3.getSelectedItem().toString().equals("간호사")) {
	    				  Staff t = new Staff(input_value[0].getText(),input_value[1].getText(),combo2.getSelectedItem().toString(),
		    					  input_value[3].getText(),depart.get_code(combo.getSelectedItem().toString()), age,
		    					  Integer.parseInt(input_value[5].getText()),combo3.getSelectedItem().toString());
	    				 
		    			  t.add_team(s);
		    			  t.get_team_member(s);
		    			  String[] row  = new String[8];
		    			  
	    		    	  row[0] = t.get_name();
	    		    	  row[1] = t.get_birth();
	    		    	  row[2] = t.get_gender();
	    		    	  row[3] = t.get_phone_num();
	    		    	  row[4] = t.get_department();
	    		    	  row[5] = ""+t.get_age();
	    		    	  row[6] = "" + t.get_staff_id();
	    		    	  row[7] = t.get_job();
	    		    	  
	    		    	  model.addRow(row);
	    			  }
	    			  else {
	    				  Staff t = new Staff(input_value[0].getText(),input_value[1].getText(),combo2.getSelectedItem().toString(),
		    					  input_value[3].getText(),depart.get_code(combo.getSelectedItem().toString()), age,
		    					  Integer.parseInt(input_value[5].getText()),combo3.getSelectedItem().toString());
	    				  
		    			  t.add_team(s);
		    			  t.get_team_member(s);
		    			  String[] row  = new String[8];
		    			  
		    			 
	    		    	  row[0] = t.get_name();
	    		    	  row[1] = t.get_birth();
	    		    	  row[2] = t.get_gender();
	    		    	  row[3] = t.get_phone_num();
	    		    	  row[4] = t.get_department();
	    		    	  row[5] = ""+t.get_age();
	    		    	  row[6] = "" + t.get_staff_id();
	    		    	  row[7] = t.get_job();
	    		    	  
	    		    	  model.addRow(row);
	    		      
	    			  }
	    			  for (int i = 0 ;i <lab.length; i++) {
	    				 // input_value[i].setText("");
	    			  }
	    		  }
	    		  else if(b.getText().equals("검색")) {
	    			  
	    		  }
	    	  }
	      }
	      
	   
	      btn.addActionListener(new myListener());
	      Total.addActionListener(new selector());
	      Doctor.addActionListener(new selector());
	      Nurse.addActionListener(new selector());
	      Programmer.addActionListener(new selector());
	     
	      
	   }
	   
	   
	   

	}


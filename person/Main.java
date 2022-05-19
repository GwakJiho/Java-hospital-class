package person;

import gui.Main_Frame;
import hospital.Room;
import hospital.Room_person;
import medical.Medical_personal;

public class Main {
	
		
	public void Delete_object(Person obj) {
		obj = null;
	}
	
	public static void main(String[] args) {
			Room_person Rp = new Room_person();
			Medical_personal s = new Medical_personal();
			Doctor d = new Doctor("돌팔이", "19700302", "남", "010", 1234, 22, 2002033,4, 1);
			d.searchDoctor("돌팔이");
			Doctor d2 = new Doctor("이익준", "19800323", "남", "010", 1234, 45, 193423 ,20, 1);
			
			Nurse N1 = new Nurse("곽소현" , "19990224", "여", "010", 1235, 24, 203211, 2 ,2 );
			
			
			Programmer p = new Programmer("곽지호", "20001225", "남", "010", 1345, 22, 20190053,4);
			p.searchPro("곽지호");
			
			Patient p1 = new Patient("환자", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p2 = new Patient("환자2", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p3 = new Patient("환자3", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			Patient p4 = new Patient("환자4", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			p1.setting_Admission(193423, 601, Rp);
			p2.setting_Admission(193423, 601, Rp);
			p3.setting_Admission(193423, 601, Rp);
			p4.setting_Admission(193423, 601, Rp);
			
			
			d.add_team(s);
			d2.add_team(s);
			N1.add_team(s);
			p.add_team(s);
			d.get_team_member(s);
			N1.get_team_member(s);
			p.get_team_member(s);
			
		
			Room R = Rp.set_room(601);
			R.get_room_memeber();
			
			
			new Main_Frame();
		}
	
	}


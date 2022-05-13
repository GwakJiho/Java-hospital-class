package person;

import hospital.Room;

public class Main {
	public static void main(String[] args) {
			Doctor d = new Doctor("돌팔이", "20001225", "남", "010", 1234, 22, 20190053,4, 1);
			d.searchDoctor("돌팔이");
			
			Programmer p = new Programmer("곽지호", "20001225", "남", "010", 1345, 22, 20190053,4);
			p.searchPro("곽지호");
			
			Patient p1 = new Patient("환자", "20030423", "여", "0222", 1234, 17, "허리",  1234 );
			p1.Search_patient("환자");
			
			
			Room room = new Room();
			for (int i = 0; i <room.length(); i++) {
				System.out.printf("%d 호실 ", room.get_room(i));
			}
			
		}
	}


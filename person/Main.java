package person;

import hospital.Room;

public class Main {
	public static void main(String[] args) {
			Doctor d = new Doctor("������", "20001225", "��", "010", 1234, 22, 20190053,4, 1);
			d.searchDoctor("������");
			
			Programmer p = new Programmer("����ȣ", "20001225", "��", "010", 1345, 22, 20190053,4);
			p.searchPro("����ȣ");
			
			Patient p1 = new Patient("ȯ��", "20030423", "��", "0222", 1234, 17, "�㸮",  1234 );
			p1.Search_patient("ȯ��");
			
			
			Room room = new Room();
			for (int i = 0; i <room.length(); i++) {
				System.out.printf("%d ȣ�� ", room.get_room(i));
			}
			
		}
	}


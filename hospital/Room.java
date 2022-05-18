package hospital;

import java.util.ArrayList;

import person.Patient;
import person.Staff;
public class Room {
	ArrayList<Integer> room_list  = new ArrayList<Integer>() {
		{
			add(601);add(602);add(603);add(604);add(605);
			add(701);add(702);add(703);add(704);add(705);
			add(801);add(802);add(803);add(804);add(805);
		}
	};
	
	public Room(int num) {
		this.room = num;
	}
	
	private int room;
	ArrayList <Patient> List = new ArrayList<>();
	
	
	public void add_Member(Patient s) {
		this.List.add(s);
	}
	
	public int get_room() {
		return this.room;
	}
	public void delete_room(Patient s) {
		this.List.remove(s);
	}
	
	public void get_room_memeber() {
		System.out.print("\n" + room + "호 실 명단 : ");
		for (Patient p : List) {
			System.out.print(p.get_name() + " ");
		}
		
	}
	
}
  //병실 객체 생성
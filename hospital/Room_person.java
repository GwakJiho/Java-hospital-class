package hospital;

import java.util.ArrayList;

public class Room_person {
	ArrayList <Room> room = new ArrayList<>();
	
	public Room set_room(int num) {
		for (Room R : room) {
			if(R.get_room() == num) {
				return R;
			}
		}
		Room r = new Room(num);
		room.add(r);
		return r;
	}
	public void get_room() {
		System.out.print(room);
	}
	
}

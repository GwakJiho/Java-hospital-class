package hospital;

import java.util.ArrayList;

public class Room_person {
	private int room_num;
	ArrayList <Room> room = new ArrayList<>();
	
	public Room set_room(int num) {
		for (Room R : room) {
			if(R.get_room() == num) {
				return R;
			}
		}
		Room r = new Room(num);
		
		room_num = num;
		room.add(r);
		return r;
	}
	public int get_room_num() {
		return room_num;
	}
}

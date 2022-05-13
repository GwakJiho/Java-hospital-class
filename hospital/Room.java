package hospital;

import java.util.ArrayList;
public class Room {
	ArrayList<Integer> room_list  = new ArrayList<Integer>() {
		{
			add(601);add(602);add(603);add(604);add(605);
			add(701);add(702);add(703);add(704);add(705);
			add(801);add(802);add(803);add(804);add(805);
		}
	};
	
	public int length() {
		return room_list.size();
	}
	public int get_room(int index) {
		return room_list.get(index);
	}
	
}
  //병실 객체 생성
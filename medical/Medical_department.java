package medical;

import java.util.HashMap;

public class Medical_department {
	HashMap<Integer,String> departments = new HashMap<Integer, String>(){
		{
		put(1234, "외과");put(1345, "보안관리과");put(1533, "식품지원담당과");
		put(1235, "내과");put(1553, "안전관리과");
		put(1236, "정신과");
		put(1237, "소아과");
		}
	};
	
	public String get_departments(int code) {
		return departments.get(code);
	}
	
	
}

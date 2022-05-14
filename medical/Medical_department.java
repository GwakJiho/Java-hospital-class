package medical;

import java.util.ArrayList;
import java.util.HashMap;

import person.Staff;

public class Medical_department {
	HashMap<Integer,String> departments = new HashMap<Integer, String>(){
		{
		put(1234, "외과");put(1345, "보안관리과");put(1533, "식품지원담당과");
		put(1235, "내과");put(1553, "안전관리과");
		put(1236, "정신과");
		put(1237, "소아과");
		}
	};
	private String name;
	ArrayList<Staff> Member = new ArrayList<>();
	
	public Medical_department() {
	}
	
	public Medical_department(String name) {
		this.name = name;
	}
	
	
	public String get_departments(int code) {
		return departments.get(code);
	}
	
	public void setting_member(Staff s) {
		
	}
	
	public void add_Member(Staff s) {
		this.Member.add(s);
	}
	
	public void get_Member() {
		System.out.print("\n" + this.name + " 명단 : ");
		for (Staff s : Member) {
			System.out.print(s.get_name() + " ");
		}
	}
	public String get_name() {
		return this.name;
	}
	
}

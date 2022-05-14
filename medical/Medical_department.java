package medical;

import java.util.ArrayList;
import java.util.HashMap;

import person.Staff;

public class Medical_department {
	HashMap<Integer,String> departments = new HashMap<Integer, String>(){
		{
		put(1234, "�ܰ�");put(1345, "���Ȱ�����");put(1533, "��ǰ��������");
		put(1235, "����");put(1553, "����������");
		put(1236, "���Ű�");
		put(1237, "�Ҿư�");
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
		System.out.print("\n" + this.name + " ��� : ");
		for (Staff s : Member) {
			System.out.print(s.get_name() + " ");
		}
	}
	public String get_name() {
		return this.name;
	}
	
}

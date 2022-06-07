package medical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import person.Staff;

public class Medical_department {
	public HashMap<Integer,String> departments = new HashMap<Integer, String>(){
		{
		put(1234, "외과");put(1345, "보안관리과");
		put(1235, "내과");put(1553, "안전관리과");
		put(1236, "정신과");
		put(1237, "소아과");
		}
	};
	private String name;
	public ArrayList<Staff> Member = new ArrayList<>();
	
	public Medical_department() {
	}
	
	public Medical_department(String name) {
		this.name = name;
	}
	
	
	
	public String get_departments(int code) {
		return departments.get(code);
	}
	
	public int get_code(String name) {
		return getKey(departments,name);
	}
	public void setting_member(Staff s) {
		
	}
	
	public void add_Member(Staff s) {
		this.Member.add(s);
	}
	public void delete_Member(Staff s) {
		this.Member.remove(s);	
	}
	
	public void get_Member() {
		System.out.print("\n" + this.name + " 명단 : ");
		for (Staff s : Member) {
			System.out.print(s.get_name() + " ");
		}
		System.out.println("");
	}
	
	public String get_name() {
		return this.name;
	}
	
	private static <K, V> K getKey(Map<K, V> map, V value) {
		 
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
 
	
}

package person;

import java.util.HashMap;

import medical.*;


public class Staff extends Person {
	HashMap <Integer, String> staff_ = new HashMap<Integer, String>(){
		{
			put(1, "의사");put(2,"간호사"); put(3, "안전직원"); put(4,"보안관리직원");
		}
	};
	
	Medical_department dt = new Medical_department();
	
	protected int department_id;
	protected int age;
	protected int Staff_id;
	protected int year;
	
	public Staff(String name, String birth, String gender, String phone,
			int department_id, int age, int stf_id, int year) {
		super(name, birth, gender, phone);
		
		this.department_id = department_id;
		this.age = age;
		this.Staff_id = stf_id;
		this.year = year;
	}
	
	void move_department(int code) {
		this.department_id =code;
	}
	public void change_staff_id(int id) {
		this.Staff_id = id;
	}
	public int get_staff_id() {
		return this.Staff_id;
	}
	public String get_department() {
		return dt.get_departments(this.department_id);
	}
	public void add_team(Medical_personal MP) { //팀에 추가
		Medical_department team = MP.set_team(this.get_department());
		System.out.println(this.get_name() + " 을(를) " + this.get_department() +"에 추가합니다.");
		team.add_Member(this);
	}
	public void get_team_member(Medical_personal MP) {
		Medical_department team = MP.set_team(this.get_department());
		team.get_Member();
	}
	@Override
	public String get_name() {
		return this.name;
	}
	
	
}

class Doctor extends Staff {
	private int staff_code ;
	public Doctor(String name, String birth, String gender, String phone,
			int dep_id, int age, int stf_id, int year, int staff_code) {
		super(name, birth, gender, phone, dep_id, age, stf_id, year);
		this.staff_code = staff_code;
	}

	void searchDoctor(String name) {
		if(name.equals(get_name()) ) {
			System.out.printf("%d, %s, %s\n", get_staff_id(), staff_.get(staff_code), get_department());
		}
	}	
}

class Nurse extends Staff{
	private int staff_code;
	public Nurse(String name, String birth, String gender, String phone, 
			int dep_id, int age, int stf_id, int year, int staff_code) {
		super(name, birth, gender, phone, dep_id, age, stf_id, year);
		this.staff_code = staff_code;
	}

	
	void searchNurse(String name) {
		if(name.equals(this.get_name()) ){
			System.out.println(this.get_staff_id());
		}
	}
}

class Programmer extends Staff{
	private int staff_code;
	public Programmer(String name, String birth, String gender, String phone, 
			int department_id, int age, int stf_id, int year) {
		super(name, birth, gender, phone, department_id, age, stf_id, year);
		this.staff_code = 4;
	}
	void searchPro(String name) {
		if(name.equals(get_name()) ) {
			System.out.printf("%d, %s, %s\n", get_staff_id(), staff_.get(staff_code), get_department());
		}
	}
	
	
}
class Schedule{
	public Schedule(Staff s) {
		// 나중에
	}
}


